/*   

  Copyright 2004, Martian Software, Inc.

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

*/

package com.martiansoftware.nailgun.builtins;

import java.util.Iterator;
import java.util.Map;

import com.martiansoftware.nailgun.NGServer;
import com.martiansoftware.nailgun.NGContext;

/**
 * <p>Displays all <a href="NailStats.html">NailStats</a> tracked by the server.</p>
 * 
 * <p>This can be run standalone with no arguments.  It will also run automatically
 * upon <code>NGServer</code> shutdown, sending its output to the server's <code>System.out</code>.</p>
 * 
 * <p>This is aliased by default to the command "<code>ng-stats</code>".</p>
 * @author <a href="http://www.martiansoftware.com/contact.html">Marty Lamb</a>
 */

public class NGServerStats {

	public static void nailShutdown(NGServer server) {
		dumpStats(server, server.out);
	}
	
	public static void nailMain(NGContext context) {
		dumpStats(context.getNGServer(), context.out);
	}

	private static void dumpStats(NGServer server, java.io.PrintStream out) {
		Map stats = server.getNailStats();
		for (Iterator i = stats.values().iterator(); i.hasNext();) {
			out.println(i.next());
		}
	}

}
