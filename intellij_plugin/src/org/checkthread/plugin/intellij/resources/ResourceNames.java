/*
Copyright (c) 2008 Joe Conti CheckThread.org

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

package org.checkthread.plugin.intellij.resources;

/**
 * Various hardcoded strings used in plugin
 */
public class ResourceNames {

    public final static String START_MSG = "***CHECKTHREAD STARTING (v1.0.9)***";
    public final static String FINISHED_MSG = "***CHECKTHREAD FINISHED***";

    public final static String NO_ERRORS_FOUND_MSG =
            "CheckThread found no errors.";

    public final static String NO_TARGET_FOUND_MSG = "No target output class directories found. There are no class files for CheckThread to analyze.";
    public final static String NO_CHECKTHREAD_ANNOTATIONS_FOUND_MSG =
            "CheckThread found no thread annotations in the target class files. \n"
                    + "See checkthread.org for examples on adding annotations to your Java code.";

    public final static String NO_CLASS_FILES_MSG =
            "CheckThread found no class files to analyze. Rebuild your IDE's Java project before running CheckThread.";
}
