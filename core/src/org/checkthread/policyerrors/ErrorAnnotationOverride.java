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

package org.checkthread.policyerrors;

import org.checkthread.main.ICheckThreadError;
import org.checkthread.parser.IMethodInfo;

public class ErrorAnnotationOverride implements ICheckThreadError {
    
	private final IMethodInfo fMethodInfo;
	
	public ErrorAnnotationOverride(IMethodInfo methodInfo) 
	{
        fMethodInfo = methodInfo;
    }

	public String getErrorMessage() {
			return "The method " + fMethodInfo.getMethodName() + " must have the" + 
			"same CheckThread annotation as its superclass.";
	}
	
	public void printErr() {
		System.out.println(getErrorMessage());
	}
	
	public String getParentName() {
		return  fMethodInfo.getMethodName();
	}
	public String getInvokedName() {
		return "not applicable";
	}
	
	public int getLineNumber() {
		return  fMethodInfo.getLineNumber();
	}
	
	public String getSourceFile() {
		return fMethodInfo.getSourceFile();
	}
	
	public String getClassFilePath() {
		return fMethodInfo.getPathToClassFile();
	}
	
}