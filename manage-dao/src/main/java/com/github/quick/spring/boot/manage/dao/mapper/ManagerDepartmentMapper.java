/*
 * Copyright 2020-present quick-spring-boot All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.quick.spring.boot.manage.dao.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.quick.spring.boot.manage.dao.entity.ManagerDepartment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ManagerDepartmentMapper extends BaseMapper<ManagerDepartment> {
	int updateBatch(List<ManagerDepartment> list);

	int updateBatchSelective(List<ManagerDepartment> list);

	int batchInsert(@Param("list") List<ManagerDepartment> list);

	int insertOrUpdate(ManagerDepartment record);

	int insertOrUpdateSelective(ManagerDepartment record);

	List<ManagerDepartment> findByPid(@Param("deptId") Long deptId);

	ManagerDepartment findByName(@Param("name") String name);

}