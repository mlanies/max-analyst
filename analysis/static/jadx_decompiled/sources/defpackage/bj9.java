package defpackage;

import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public abstract class bj9 {
    public static final Symbol a = new Symbol("NO_OWNER");

    static {
        new Symbol("ALREADY_LOCKED_BY_OWNER");
    }

    public static aj9 a() {
        return new aj9(false);
    }
}
