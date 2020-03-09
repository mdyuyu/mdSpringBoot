# cps商品数据和订单数据接入

1 所有模块均在cpsDataAccessMicroServices下面
2 cps-data-access-core
  功能:负责将已经清洗过符合格式要求的友商数据进行操作.
       操作1:关键字段不缺,直接落入数据库
       操作2:关键字段缺席,上报数据。（可以先统一入库。在专门写一个上报的数据接口）。
  
3 cps-access-XXX:其中xxx具体的友商。
  功能:负责根据友商提供的接口.(http/rpc协议接口)，获取数据，进行清洗。最终获得符合格式的数据。
  然后调用cps-data-access-core.