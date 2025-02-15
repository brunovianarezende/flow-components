/*
 * Copyright 2000-2023 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.flow.component.grid;

import com.vaadin.flow.component.grid.Grid.Column;
import com.vaadin.flow.data.provider.SortDirection;
import com.vaadin.flow.data.provider.SortOrderBuilder;

/**
 * Helper classes with fluent API for constructing {@link GridSortOrder} lists.
 * When the sort order is ready to be passed on, calling {@link #build()} will
 * create the list of sort orders.
 *
 * @see GridSortOrder
 * @see GridSortOrderBuilder#thenAsc(com.vaadin.flow.component.grid.Grid.Column)
 * @see GridSortOrderBuilder#thenDesc(com.vaadin.flow.component.grid.Grid.Column)
 * @see #build()
 *
 * @author Vaadin Ltd.
 *
 * @param <T>
 *            the type of the grid
 */
public class GridSortOrderBuilder<T>
        extends SortOrderBuilder<GridSortOrder<T>, Column<T>> {

    @Override
    public GridSortOrderBuilder<T> thenAsc(Column<T> by) {
        return (GridSortOrderBuilder<T>) super.thenAsc(by);
    }

    @Override
    public GridSortOrderBuilder<T> thenDesc(Column<T> by) {
        return (GridSortOrderBuilder<T>) super.thenDesc(by);
    }

    @Override
    protected GridSortOrder<T> createSortOrder(Column<T> by,
            SortDirection direction) {
        return new GridSortOrder<>(by, direction);
    }
}
