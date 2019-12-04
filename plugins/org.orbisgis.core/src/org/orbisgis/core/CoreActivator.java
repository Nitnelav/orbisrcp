/*
 * Groovy Editor (GE) is a library that brings a groovy console to the Eclipse RCP. 
 * GE is developed by CNRS http://www.cnrs.fr/.
 *
 * GE is part of the OrbisGIS project. GE is free software;
 * you can redistribute it and/or modify it under the terms of the GNU Lesser 
 * General Public License as published by the Free Software Foundation;
 * version 3.0 of the License.
 *
 * GE is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details http://www.gnu.org/licenses.
 *
 *
 *For more information, please consult: http://www.orbisgis.org
 *or contact directly: info_at_orbisgis.org
 */
package org.orbisgis.core;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.orbisgis.core.workspace.CoreWorkspace;
import org.orbisgis.core.workspace.ICoreWorkspace;
import org.osgi.framework.BundleContext;

/**
 * Plugin activator which provides access to eclipse resources.
 */
public class CoreActivator extends AbstractUIPlugin {

    private static CoreActivator instance;
    
    private ICoreWorkspace coreWorkspace;

    public static CoreActivator getInstance()
    {
        return instance;
    }

    public final ICoreWorkspace getCoreWorkspace(){
        return coreWorkspace;
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        instance = this;
        this.coreWorkspace = new CoreWorkspace();
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        this.coreWorkspace = null;
        instance = null;
        super.stop(context);
    }
}
