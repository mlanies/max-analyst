package ru.ok.tamtam;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"ru/ok/tamtam/ExceptionHandler$HandledException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ExceptionHandler$HandledException extends Exception {
    public final String a;

    /* JADX WARN: Multi-variable type inference failed */
    public ExceptionHandler$HandledException() {
        this(null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ExceptionHandler$HandledException(String str, Throwable th, int i, String str2) {
        this((i & 1) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 2) != 0 ? null : th);
    }

    public ExceptionHandler$HandledException(String str, String str2, Throwable th) {
        super(str, th);
        this.a = str2;
    }
}
