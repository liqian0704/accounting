//package CustomerUser;
//
//
//import javax.sql.PooledConnection;
//import java.sql.*;
//import java.util.Enumeration;
//import java.util.Vector;
//
///**
// * Created by yp-tc-2646 on 18/2/1.
// */
//public class ConnectionPool {
//    private String jdbcDriver="";// 数据库驱动
//    private String dbURL="";// 数据 URL
//    private String dbUsername="";// 数据库用户名
//    private String dbPassword="";// 数据库用户密码
//    private String testTable = ""; // 测试连接是否可用的测试表名，默认没有测试表
//    private int initialConnections=10;// 连接池的初始大小
//    private int incrementalConnecions=5;// 连接池自动增加的大小
//    private int maxConnections=50;// 连接池最大的大小
//    private Vector connections=null;//存放连接池中数据库连接的向量 , 初始时为 null
//
//    public ConnectionPool(String jdbcDriver,String dbURL,String dbUsername,String dbPassword){
//        this.jdbcDriver=jdbcDriver;
//        this.dbURL=dbURL;
//        this.dbUsername=dbUsername;
//        this.dbPassword=dbPassword;
//        try {
//            createPool();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * @return 初始连接池中可获得的连接数量
//     */
//    public int getInitialConnections(){
//        return  this.initialConnections;
//    }
//
//    /**
//     * 用于设置初始连接池中连接的数量
//     * @param initialConnections
//     */
//    public void setInitialConnections(int initialConnections){
//        this.initialConnections=initialConnections;
//    }
//
//    /**
//     * 连接池中最大的可用连接数量
//     * @return
//     */
//    public int getMaxConnections(){
//        return this.maxConnections;
//
//    }
//
//    /**
//     * 设置连接池中最大可用的连接数量
//     * @param maxConnections
//     */
//    public void setMaxConnections(int maxConnections){
//        this.maxConnections=maxConnections;
//    }
//
//    /**
//     * 返回连接池自动增加的大小
//     * @return
//     */
//    public int getIncrementalConnecions(){
//        return this.incrementalConnecions;
//    }
//
//    /**
//     *  设置连接池自动增加的大小
//     * @param incrementalConnecions
//     */
//    public void setIncrementalConnecions(int incrementalConnecions){
//        this.incrementalConnecions=incrementalConnecions;
//    }
//    /**
//
//     * 获取测试数据库表的名字
//
//     *
//
//     * @return 测试数据库表的名字
//
//     */
//    public String getTestTable(){
//        return this.testTable;
//    }
//    /**
//
//     * 设置测试表的名字
//
//     * @param testTable String 测试表的名字
//
//     */
//    public void setTestTable(String testTable){
//        this.testTable=testTable;
//    }
//    /**
//
//     *
//
//     * 创建一个数据库连接池，连接池中的可用连接的数量采用类成员
//
//     * initialConnections 中设置的值
//
//     */
//
//    public synchronized void createPool() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
//        //确保连接池没有创建
//        //如果连接池已经创建了,保存连接的向量connections不会为空
//        if(connections!=null){
//            return;//如果已创建,则返回
//        }
//        // 实例化 JDBC Driver 中指定的驱动类实例
//        Driver driver=(Driver)(Class.forName(this.jdbcDriver).newInstance());
//        DriverManager.registerDriver(driver);// 注册 JDBC 驱动程序
//        // 创建保存连接的向量 , 初始时有 0 个元素
//        connections=new Vector();
//        // 根据 initialConnections 中设置的值，创建连接。
//        createConnections()
//
//    }
//    private void createConnections(int numConnections){
//        //循环创建指定数目的数据库连接
//        for (int x=0;x<numConnections;x++){
//            //是否数据库中连接的数量已达到最大?最大值由类成员maxConnections
//            //指出,如果maxConnections为0或者负数,表示连接数量没有限制
//            //如果连接数量已达到最大,即退出
//            if(this.maxConnections > 0
//                    && this.connections.size() >= this.maxConnections){
//                break;
//            }
//            //add a new PooledConnection object to connections vector
//            // 增加一个连接到连接池中（向量 connections 中）
//            connections.addElement(new PooledConnection(newConnection) {
//            });
//        }
//    }
//    public Connection newConnection() throws SQLException {
//        //创建数据库连接
//        Connection conn= (Connection) DriverManager.getConnection(dbURL,dbUsername,dbPassword);
//        // 如果这是第一次创建数据库连接，即检查数据库，获得此数据库允许支持的
//        // 最大客户连接数目
//        //connections.size()==0 表示目前没有连接己被创建
//        if(connections.size()==0){
//            DatabaseMetaData metaData=conn.getMetaData();
//            int  driverMaxConnections=metaData.getMaxConnections();
//            // 数据库返回的 driverMaxConnections 若为 0 ，表示此数据库没有最大
//            // 连接限制，或数据库的最大连接限制不知道
//            //driverMaxConnections 为返回的一个整数，表示此数据库允许客户连接的数目
//            // 如果连接池中设置的最大连接数量大于数据库允许的连接数目 , 则置连接池的最大
//            // 连接数目为数据库允许的最大数目
//            if (driverMaxConnections > 0
//                    && this.maxConnections > driverMaxConnections) {
//
//                this.maxConnections = driverMaxConnections;
//
//            }
//
//        }
//        return conn; // 返回创建的新的数据库连接
//    }
//    /**
//
//     * 通过调用 getFreeConnection() 函数返回一个可用的数据库连接 ,
//
//     * 如果当前没有可用的数据库连接，并且更多的数据库连接不能创
//
//     * 建（如连接池大小的限制），此函数等待一会再尝试获取。
//
//     * @return 返回一个可用的数据库连接对象
//
//     */
//    public synchronized Connection getConnection(){
//        //确保连接池已被创建
//        if(connections==null){
//            return  null;//连接池还没被创建,则返回null
//        }
//        Connection conn=getFreeConnection(); // 获得一个可用的数据库连接
//    }
//    /**
//
//     * 本函数从连接池向量 connections 中返回一个可用的的数据库连接，如果
//
//     * 当前没有可用的数据库连接，本函数则根据 incrementalConnections 设置
//
//     * 的值创建几个数据库连接，并放入连接池中。
//
//     * 如果创建后，所有的连接仍都在使用中，则返回 null
//
//     * @return 返回一个可用的数据库连接
//
//     */
//    public  Connection getFreeConnection(){
//
//    }
//    /**
//
//     * 查找连接池中所有的连接，查找一个可用的数据库连接，
//
//     * 如果没有可用的连接，返回 null
//
//     *
//
//     * @return 返回一个可用的数据库连接
//
//     */
//    private Connection findFreeConnection(){
//        Connection conn=null;
//        PooledConnection pConn=null;
//        //获得连接池向量中所有的对象
//
//    }
//    /**
//
//     * 查找连接池中所有的连接，查找一个可用的数据库连接，
//
//     * 如果没有可用的连接，返回 null
//
//     *
//
//     * @return 返回一个可用的数据库连接
//
//     */
//    private boolean testConnection(){
//
//    }
//    /**
//
//     * 此函数返回一个数据库连接到连接池中，并把此连接置为空闲。
//
//     * 所有使用连接池获得的数据库连接均应在不使用此连接时返回它。
//
//     *
//
//     * @param 需返回到连接池中的连接对象
//
//     */
//    public void returnConnection(Connection conn) throws SQLException {
//        // 确保连接池存在，如果连接没有创建（不存在），直接返回
//        if(connections==null){
//            System.out.println("连接池不存在,无法返回此连接到连接池中");
//            return;
//        }
//        PooledConnection pConn=null;
//        Enumeration enumeration=connections.elements();
//        // 遍历连接池中的所有连接，找到这个要返回的连接对象
//        while (enumeration.hasMoreElements()){
//            pConn=(PooledConnection) enumeration.nextElement();
//            // 先找到连接池中的要返回的连接对象
//            if(conn==pConn.getConnection()){
//                // 找到了 , 设置此连接为空闲状态
//                pConn.setBusy(false);
//                break;
//
//            }
//        }
//
//
//    }
//    /**
//
//     * 刷新连接池中所有的连接对象
//
//     *
//
//     */
//    public  synchronized void refreshConnections() throws SQLException {
//        // 确保连接池己创新存在
//        if(connections==null){
//            System.out.println("连接池不存在,无法刷新!");
//            return;
//        }
//        PooledConnection pConn=null;
//        Enumeration enumerate=connections.elements();
//        while (enumerate.hasMoreElements()){
//            //获得一个连接对象
//            pConn=(PooledConnection) enumerate.nextElement();
//            // 如果对象忙则等 5 秒 ,5 秒后直接刷新
//            if(pConn.isBusy()){
//                wait(5000);
//            }
//            // 关闭此连接，用一个新的连接代替它。
//            closeConnection(pConn.getConnection());
//
//            pConn.setConnection(newConnection());
//
//            pConn.setBusy(false);
//
//
//
//        }
//
//    }
//    /**
//
//     * 关闭连接池中所有的连接，并清空连接池。
//
//     */
//    public synchronized void closeConnectionPool(){
//
//
//    }
//    /**
//
//     * 关闭一个数据库连接
//     * @param 需要关闭的数据库连接
//
//     */
//    public void closeConnection(Connection conn){
//        try {
//            conn.close();
//        } catch (SQLException e) {
//            System.out.println("关闭数据库连接出错"+e.getMessage());
//        }
//    }
//    /**
//
//     * 使程序等待给定的毫秒数
//
//     *
//
//     * @param 给定的毫秒数
//
//     */
//    public void wait(int mseconds){
//        try {
//            Thread.sleep(mseconds);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//    /**
//
//     * 内部使用的用于保存连接池中连接对象的类
//
//     * 此类中有两个成员，一个是数据库的连接，另一个是指示此连接是否
//
//     * 正在使用的标志。
//
//     */
//    class PooledConnection{
//        Connection connection=null;//数据库连接
//        boolean busy=false;//是否正在使用的标识,默认没有正在使用
//        // 构造函数，根据一个 Connection 构告一个 PooledConnection 对象
//        public PooledConnection(Connection connection){
//            this.connection=connection;
//        }
//        //返回此对象中的连接
//        public Connection getConnection(){
//
//            return  connection;
//
//        }
//        //设置此对象的连接
//        public void setConnection(Connection connection){
//            this.connection=connection;
//        }
//        // 获得对象连接是否忙
//        public boolean isBusy(){
//
//            return  busy;
//        }
//        //设置对象正在忙
//        public void setBusy(boolean busy){
//            this.busy=busy;
//        }
//    }
//
//
//}
