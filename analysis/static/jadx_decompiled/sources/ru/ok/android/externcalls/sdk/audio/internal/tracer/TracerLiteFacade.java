package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import android.content.Context;
import defpackage.je7;
import defpackage.khe;
import defpackage.qye;
import defpackage.wye;
import defpackage.z84;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/tracer/TracerLiteFacade;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "cause", "", "issueKey", "Le5f;", "reportCrash", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "Lwye;", "tracerLite$delegate", "Lje7;", "getTracerLite", "()Lwye;", "tracerLite", "Lqye;", "crashReport$delegate", "getCrashReport", "()Lqye;", "crashReport", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class TracerLiteFacade {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_AUDIOMANAGER_VERSION = "calls-audiomanager-version";

    /* renamed from: crashReport$delegate, reason: from kotlin metadata */
    private final je7 crashReport = new khe(new TracerLiteFacade$crashReport$2(this));

    /* renamed from: tracerLite$delegate, reason: from kotlin metadata */
    private final je7 tracerLite;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/tracer/TracerLiteFacade$Companion;", "", "()V", "KEY_AUDIOMANAGER_VERSION", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    public TracerLiteFacade(Context context) {
        this.tracerLite = new khe(new TracerLiteFacade$tracerLite$2(context));
    }

    private final qye getCrashReport() {
        return (qye) this.crashReport.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wye getTracerLite() {
        return (wye) this.tracerLite.getValue();
    }

    public static /* synthetic */ void reportCrash$default(TracerLiteFacade tracerLiteFacade, Throwable th, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        tracerLiteFacade.reportCrash(th, str);
    }

    public final void reportCrash(Throwable th) {
        reportCrash$default(this, th, null, 2, null);
    }

    public final void reportCrash(Throwable cause, String issueKey) {
        try {
            getCrashReport().a(issueKey, cause);
        } catch (Throwable unused) {
        }
    }
}
