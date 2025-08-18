package ru.ok.tamtam.util;

import java.util.Locale;

@Deprecated
/* loaded from: classes2.dex */
public class HandledException extends Exception {
    public HandledException(Throwable th) {
        super(th == null ? "Empty throwable" : th.toString(), th);
    }

    public HandledException(String str, Object... objArr) {
        super(String.format(Locale.ENGLISH, str, objArr));
    }
}
