package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* loaded from: classes.dex */
public final class s11 extends ffe implements e66 {
    public /* synthetic */ CallsAudioDeviceInfo X;
    public /* synthetic */ la1 Y;
    public /* synthetic */ boolean Z;
    public final /* synthetic */ h21 s0;
    public final /* synthetic */ je7 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s11(h21 h21Var, je7 je7Var, Continuation continuation) {
        super(4, continuation);
        this.s0 = h21Var;
        this.t0 = je7Var;
    }

    @Override // defpackage.e66
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        s11 s11Var = new s11(this.s0, this.t0, (Continuation) obj4);
        s11Var.X = (CallsAudioDeviceInfo) obj;
        s11Var.Y = (la1) obj2;
        s11Var.Z = zBooleanValue;
        e5f e5fVar = e5f.a;
        s11Var.o(e5fVar);
        return e5fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            defpackage.od2.a0(r14)
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r14 = r13.X
            la1 r0 = r13.Y
            boolean r1 = r13.Z
            h21 r2 = r13.s0
            q0e r3 = r2.t0
        Ld:
            java.lang.Object r4 = r3.getValue()
            r5 = r4
            zq0 r5 = (defpackage.zq0) r5
            m38 r7 = r0.r
            m38 r6 = defpackage.m38.b
            m38 r8 = defpackage.m38.o
            boolean r9 = r0.g
            je7 r10 = r13.t0
            if (r9 == 0) goto L35
            i95 r9 = r0.e
            boolean r9 = r9 instanceof defpackage.h95
            if (r9 == 0) goto L27
            goto L35
        L27:
            java.lang.Object r9 = r10.getValue()
            qe5 r9 = (defpackage.qe5) r9
            se5 r9 = (defpackage.se5) r9
            boolean r9 = r9.q()
            if (r9 != 0) goto L37
        L35:
            r9 = r8
            goto L3d
        L37:
            if (r1 == 0) goto L3b
            r9 = r6
            goto L3d
        L3b:
            m38 r9 = defpackage.m38.a
        L3d:
            java.lang.Object r10 = r10.getValue()
            qe5 r10 = (defpackage.qe5) r10
            se5 r10 = (defpackage.se5) r10
            r10.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r11 = ru.ok.tamtam.android.prefs.PmsKey.f44groupcallchatsupport
            r12 = 0
            boolean r10 = r10.n(r11, r12)
            if (r10 != 0) goto L53
        L51:
            r10 = r8
            goto L5f
        L53:
            m31 r10 = r0.f
            if (r10 == 0) goto L5a
            java.lang.Long r10 = r10.a
            goto L5b
        L5a:
            r10 = 0
        L5b:
            if (r10 != 0) goto L5e
            goto L51
        L5e:
            r10 = r6
        L5f:
            el1 r6 = r2.c
            boolean r6 = r6.u()
            a51 r11 = defpackage.dz7.b(r14, r6)
            r5.getClass()
            zq0 r5 = new zq0
            m38 r8 = r0.q
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            boolean r4 = r3.c(r4, r5)
            if (r4 == 0) goto Ld
            e5f r13 = defpackage.e5f.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s11.o(java.lang.Object):java.lang.Object");
    }
}
