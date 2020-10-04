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

package com.github.quick.spring.boot.manage.model.req.permission;

public class CreatePermission {
	/**
	 * 资源类型
	 * @see com.github.quick.spring.boot.manage.model.enums.PermissionType
	 */
	private int type;


	private FullPermission fullPermission;

	@Override
	public String toString() {
		return "CreatePermission{" +
				"type=" + type +
				", fullPermission=" + fullPermission +
				'}';
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public FullPermission getfullPermission() {
		return fullPermission;
	}

	public void setfullPermission(FullPermission fullPermission) {
		this.fullPermission = fullPermission;
	}
}