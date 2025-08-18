package ru.ok.android.externcalls.sdk.factory.internal;

import defpackage.a4c;
import defpackage.k56;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/internal/RTCLogWrapper;", "La4c;", "Lkotlin/Function0;", "logger", "<init>", "(Lk56;)V", "", "tag", "msg", "Le5f;", "log", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "logException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "reportException", "Lk56;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RTCLogWrapper implements a4c {
    private final k56 logger;

    public RTCLogWrapper(k56 k56Var) {
        this.logger = k56Var;
    }

    @Override // defpackage.a4c
    public void log(String tag, String msg) {
        a4c a4cVar = (a4c) this.logger.invoke();
        if (a4cVar != null) {
            a4cVar.log(tag, msg);
        }
    }

    @Override // defpackage.a4c
    public void logException(String tag, String msg, Throwable throwable) {
        a4c a4cVar = (a4c) this.logger.invoke();
        if (a4cVar != null) {
            a4cVar.logException(tag, msg, throwable);
        }
    }

    @Override // defpackage.a4c
    public void reportException(String tag, String msg, Throwable throwable) {
        a4c a4cVar = (a4c) this.logger.invoke();
        if (a4cVar != null) {
            a4cVar.reportException(tag, msg, throwable);
        }
    }
}
