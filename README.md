SpringCloud+Nacos+Feign+Gateway练手项目
部署方式：

 1. 本地部署单机模式的Nacos，版本为1.4.1，端口号为8848
 2. 本地MySQL新建cloud_user和cloud_order数据库，两者再分别创建poizon_user和poizon_clouder表格，相关sql见sql文件夹中
 3. 运行项目中的OrderApplication（端口8080）、两个UserApplication（端口8081和8082）以及GateWayApplication（端口10010）
 4. 访问http://localhost:10010/order/101?authorization=admin （其中orderId的范围是101~106）可返回订单相关数据，同时订单服务中通过feign调用了用户服务，返回该订单对应的下单用户信息。
 5. 访问http://localhost:10010/user/1?authorization=admin （其中userId的范围是1~6）可返回用户相关数据。
