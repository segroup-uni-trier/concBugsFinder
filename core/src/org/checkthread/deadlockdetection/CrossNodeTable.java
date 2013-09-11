/*
Copyright (c) 2008 Joe Conti

Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the "Software"), to deal in the Software without
restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.
*/

package org.checkthread.deadlockdetection;

import java.util.ArrayList;

final public class CrossNodeTable {
	private ArrayList<Cross> table = new ArrayList<Cross>();
	
	public void addCross(INode start, INode stop) {
		Cross cross = new Cross();
		cross.fStart = start;
		cross.fStop = stop;
		table.add(cross);
	}
	
	public ArrayList<Cross> getTable() {return table;}
	
	public void dump() {
		System.out.println("");
		System.out.println("***Cross Node Table***");
		for(Cross cross : table) {
			System.out.println(" Stop: " + cross.fStop.getShortName());
		}
		System.out.println("");
	}
}
