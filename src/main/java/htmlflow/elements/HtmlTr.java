/*
 * Copyright (c) 2016, Miguel Gamboa
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package htmlflow.elements;

import htmlflow.HtmlWriterComposite;

/**
 * @author Miguel Gamboa
 *         created on 29-03-2012
 */
public class HtmlTr<T> extends HtmlWriterComposite<T, HtmlTr<T>>{
	
	public HtmlTd<T> td(){return addChild(new HtmlTd<T>());}
	public HtmlTh<T> th(){return addChild(new HtmlTh<T>());}
	
    @Override
    public String getElementName() {
      return ElementType.TR.toString();
    }
}
