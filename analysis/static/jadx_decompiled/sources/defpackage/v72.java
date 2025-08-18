package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final /* synthetic */ class v72 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long o;

    public /* synthetic */ v72(long j, long j2) {
        this.a = 0;
        this.b = j;
        this.o = j2;
        this.c = null;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        long j = this.b;
        long j2 = this.o;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                u82 u82Var = (u82) obj;
                String str = (String) obj2;
                hm9.m("p82", "reactions, updateLastReaction chatId = %d, lastReactedMessageId = %d, lastREaction = %s", Long.valueOf(j), Long.valueOf(j2), str);
                if (j2 != 0) {
                    if (u82Var.n0 != j2) {
                        u82Var.n0 = j2;
                    }
                    String str2 = u82Var.o0;
                    if (str2 == null || !str2.equals(str)) {
                        u82Var.o0 = str;
                        break;
                    }
                } else {
                    u82Var.n0 = 0L;
                    u82Var.o0 = null;
                    break;
                }
                break;
            case 1:
                u82 u82Var2 = (u82) obj;
                u82Var2.getClass();
                u82Var2.m0 = new g92(this.o, (String) obj2, this.b);
                break;
            default:
                j10 j10Var = (j10) obj;
                au8 au8Var = (au8) obj2;
                au8Var.getClass();
                if (j10Var.e != null && j2 != 0) {
                    ((p7b) au8Var.c).b.getClass();
                    if (j2 >= ((int) r10.q(PmsKey.f82mindurationsaveaudiostarttime, 20))) {
                        if (j2 - j <= CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS) {
                            j = 0;
                        }
                        i10 i10Var = j10Var.e;
                        if (i10Var == null) {
                            i10Var = i10.j;
                        }
                        h10 h10VarA = i10Var.a();
                        h10VarA.g = j;
                        h10VarA.c = j2;
                        h10VarA.h = System.currentTimeMillis();
                        j10Var.e = new i10(h10VarA);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ v72(long j, String str, long j2) {
        this.a = 1;
        this.b = j;
        this.c = str;
        this.o = j2;
    }

    public /* synthetic */ v72(au8 au8Var, long j, long j2) {
        this.a = 2;
        this.c = au8Var;
        this.b = j;
        this.o = j2;
    }
}
