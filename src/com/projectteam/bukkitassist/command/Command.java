/*
 * This file is part of BukkitAssist.
 *
 * BukkitAssist is licensed under the ProjectTeam License Version 1.
 *
 * BukkitAssist is free API: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the ProjectTeam License Version 1.
 *
 * BukkitAssist is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the ProjectTeam License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License.
 */
package com.projectteam.bukkitassist.command;

public enum Command {
	
	VERSION("bukkitassist"),
	MENU("help"),
	RELOAD("reload");
	
	private String command;
	
	private Command(String command){
		this.command = command;
	}
	
	public String getCommandName(){
		return this.command;
	}
	
	

	
	

}
