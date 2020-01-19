select  * from cms_file;
SELECT  * from sys_message
SELECT * from sys_
SELECT  * from sys_user_role
SELECT  * from sys_user_role；
SELECT  * from sys_menu where menu_id=281;
SELECT  * from sys_menu where url like '%api-maintenance/message/list%';
select * from  sys_role_menu where menu_id=281
select * from  sys_menu where parent_id=281
select * from  sys_menu where name='系统管理'
INSERT INTO `tianfucloud_coalMine`.`sys_role_menu` (`id`, `role_id`, `menu_id`) VALUES ('12351', '1', '282');
select  * from sys_dict where parent_id in(35 , 36);
select * from sys_role
select  * from sys_dict where id in(143,158)
select * from sys_message;
select `id`,`user_id` as userId,`role_id` as roleId from sys_user_role WHERE role_id = 1
select * from sys_role;
select id,title,message_type,(select  name from sys_dict where id=message_type)as messageTypeName,content,create_Date as createDate,
state,(case when state=0 then '未读' else '已读' END) stateName ,
workId,(select role_name  from sys_role where role_id=workId )as workName
from sys_message;
select  * from  sys_dept where   dept_id in(select dept_id from sys_dept where  find_in_set(dept_id, getChildLst(6)));


select  *  from sys_equipment_location;


select  *  from sys_equipment;


select *  from sys_car;

select id,cardNum,code,type,create_Date as createDate from sys_car;






select * from sys_menu where url like '%api-mobileadmin/workFLow/update%'


select * from sys_role_menu where menu_id=311;



select max(id) from sys_role_menu where menu_id=311;

 

select * from sys_car_operation;

nohup java -Xmx64m -Xms64m -Xmn64m -jar clouddo-equipment-mobile-api-0.0.1-SNAPSHOT.jar >equipment.log 2>&1 &



INSERT INTO `tianfucloud_coalMine`.`sys_role_menu` (`id`, `role_id`, `menu_id`) VALUES ('12556', '1', '319');


select * from sys_menu;

select * from sys_workFLow




