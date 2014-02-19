/*******************************************************************************
 * FPSTiming (version 1.0.0)
 * Copyright (c) 2014 National University of Colombia, https://github.com/remixlab
 * @author Jean Pierre Charalambos, http://otrolado.info/
 *     
 * All rights reserved. Library that eases the creation of interactive
 * scenes, released under the terms of the GNU Public License v3.0
 * which is available at http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package main.client;

import org.timepedia.exporter.client.Export;
import org.timepedia.exporter.client.ExportConstructor;
import org.timepedia.exporter.client.ExportOverlay;
import org.timepedia.exporter.client.ExportPackage;

import processing.core.PApplet;

import com.google.gwt.core.client.JavaScriptObject;

// TODO: Auto-generated Javadoc
/**
 * The Class ExporterFacade.
 */
public class ExporterFacade {
	
	
	/**
	 * The Class Animation2DFacade.
	 */
	@ExportPackage("")	
	@Export ("Animation2D")

	public static abstract class Animation2DFacade implements ExportOverlay<Animation2D> {

		/**
		 * Constructor.
		 *
		 * @param ctx the ctx
		 * @return the animation2 d
		 */
		@ExportConstructor
		public static Animation2D constructor(JavaScriptObject ctx)
		{
			return new 	Animation2D( new PApplet (ctx));			
		}
		
		/**
		 * Setup.
		 */
		public abstract void setup();
		
		/**
		 * Draw.
		 */
		public abstract void draw();
		
		/**
		 * Key pressed.
		 */
		public abstract void keyPressed();

		

	}
	
	/**
	 * The Class Animation3DFacade.
	 */
	@ExportPackage("")	
	@Export ("Animation3D")

	public static abstract class Animation3DFacade implements ExportOverlay<Animation3D> {

		/**
		 * Constructor.
		 *
		 * @param ctx the ctx
		 * @return the animation3 d
		 */
		@ExportConstructor
		public static Animation3D constructor(JavaScriptObject ctx)
		{
			return new 	Animation3D( new PApplet (ctx));			
		}
		
		/**
		 * Setup.
		 */
		public abstract void setup();
		
		/**
		 * Draw.
		 */
		public abstract void draw();
		
		/**
		 * Key pressed.
		 */
		public abstract void keyPressed();

		

	}		

}
