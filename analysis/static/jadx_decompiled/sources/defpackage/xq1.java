package defpackage;

import java.util.concurrent.Executor;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes2.dex */
public final /* synthetic */ class xq1 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xq1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                CallsAudioManagerV3Impl.startTrackingAudioDevices$lambda$4$lambda$3((CallsAudioManagerV3Impl) this.b, runnable);
                break;
            case 1:
                oaf.W(((i98) this.b).s0, runnable);
                break;
            default:
                oaf.W(((ii8) this.b).l, runnable);
                break;
        }
    }
}
