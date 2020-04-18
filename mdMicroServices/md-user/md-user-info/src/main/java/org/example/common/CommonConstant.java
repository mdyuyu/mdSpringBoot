package org.example.common;

/**
 * @Description:
 * @ProjectName: maibao
 * @Author: archarhuang
 * @CreateDate: 2020/1/17
 */
public class CommonConstant {

    //数据状态有效
    public static Integer DATA_STATUS_VALID = 1;
    //数据状态无效
    public static Integer DATA_STATUS_NO_VALID = -99;

    public static String SYSTEM_USER_NAME = "ADMIN";

    public static Long SYSTEM_USER_ID = 1000l;

    //内部应用状态：1 启用 2 禁用
    public static Integer INNER_APP_USED = 1;
    public static Integer INNER_APP_NO_USED = 2;

    //实务
    public final static  String DB_TRANSACTION = "dbTransactionManager";
    public final static String DB_1_TRANSACTION = "db1TransactionManager";


}
