/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Official ZAP Jenkins Plugin and its related class files.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.jenkinsci.zaproxyplugin;

import java.io.Serializable;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;

/*
 * @author Ludovic Roucoux
 * @author Johann Ollivier-Lapeyre
 * @author Thilina Madhusanka
 * @author Abdellah Azougarh
 * @author Goran Sarenkapa
 * @author Mostafa AbdelMoez
 * @author Tanguy de Lignières
 */

/**
 * This object allows to add a ZAP command line option.
 *
 * @see <a href="https://code.google.com/p/zaproxy/wiki/HelpCmdline"> https://code.google.com/p/zaproxy/wiki/HelpCmdline</a>
 */
public class ZAPCmdLine extends AbstractDescribableImpl<ZAPCmdLine> implements Serializable {

    private static final long serialVersionUID = -695679474175608775L;

    @DataBoundConstructor
    public ZAPCmdLine(String cmdLineOption, String cmdLineValue) {
        this.cmdLineOption = cmdLineOption;
        this.cmdLineValue = cmdLineValue;
    }

    /** Configuration key for the command line */
    private final String cmdLineOption;

    public String getCmdLineOption() { return cmdLineOption; }

    /** Configuration value for the command line */
    private final String cmdLineValue;

    public String getCmdLineValue() { return cmdLineValue; }

    @Override
    public String toString() {
        String s = "";
        //s += "OPTION: " + cmdLineOption + " & VALUE: " + cmdLineValue;
        s += "\n\t\tOPTION : [ " + cmdLineOption + " ]\n";
        s += "\t\tVALUE  : [ " + cmdLineValue + " ]\n";
        return s;
    }

    @Extension
    public static class ZAPCmdLineDescriptorImpl extends Descriptor<ZAPCmdLine> {

        @Override
        public String getDisplayName() {
            return "ZAP Command Line";
        }
    }
}
