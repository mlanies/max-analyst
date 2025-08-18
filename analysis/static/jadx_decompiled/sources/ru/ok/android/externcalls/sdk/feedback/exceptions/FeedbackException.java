package ru.ok.android.externcalls.sdk.feedback.exceptions;

import defpackage.z84;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/exceptions/FeedbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FeedbackException extends RuntimeException {
    private final Throwable cause;
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ FeedbackException(String str, Throwable th, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public FeedbackException(String str, Throwable th) {
        super(str, th);
        this.message = str;
        this.cause = th;
    }
}
