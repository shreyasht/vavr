/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

import javaslang.CheckedFunction0;

/**
 * Checked version of java.util.function.Supplier.
 *
 * @param <R> Return type
 */
@FunctionalInterface
public interface CheckedSupplier<R> extends CheckedFunction0<R> {

    static final long serialVersionUID = 1L;

    R get() throws Throwable;

    @Override
    default R apply() throws Throwable {
        return get();
    }
}