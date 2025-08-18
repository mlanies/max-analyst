package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t30 {
    public static final t30 c = new t30(zw6.n(r30.d));
    public static final ffc d;
    public static final cx6 e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        c54.n(3, objArr);
        d = zw6.h(3, objArr);
        jn jnVar = new jn(4);
        jnVar.I(5, 6);
        jnVar.I(17, 6);
        jnVar.I(7, 6);
        jnVar.I(30, 10);
        jnVar.I(18, 6);
        jnVar.I(6, 8);
        jnVar.I(8, 8);
        jnVar.I(14, 8);
        e = jnVar.j();
    }

    public t30(ffc ffcVar) {
        for (int i = 0; i < ffcVar.o; i++) {
            r30 r30Var = (r30) ffcVar.get(i);
            this.a.put(r30Var.a, r30Var);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((r30) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
    }

    public static ffc a(int i, int[] iArr) {
        ww6 ww6VarI = zw6.i();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            ww6VarI.a(new r30(i2, i));
        }
        return ww6VarI.j();
    }

    public static t30 b(Context context, h30 h30Var, g40 g40Var) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), h30Var, g40Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.t30 c(android.content.Context r5, android.content.Intent r6, defpackage.h30 r7, defpackage.g40 r8) {
        /*
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r5.getSystemService(r0)
            r0.getClass()
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r1 = 33
            if (r8 == 0) goto L10
            goto L1a
        L10:
            int r8 = defpackage.oaf.a
            if (r8 < r1) goto L19
            g40 r8 = defpackage.q30.b(r0, r7)
            goto L1a
        L19:
            r8 = 0
        L1a:
            int r2 = defpackage.oaf.a
            java.lang.String r3 = "android.hardware.type.automotive"
            r4 = 23
            if (r2 < r1) goto L39
            boolean r1 = defpackage.oaf.P(r5)
            if (r1 != 0) goto L34
            if (r2 < r4) goto L39
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            boolean r1 = r1.hasSystemFeature(r3)
            if (r1 == 0) goto L39
        L34:
            t30 r5 = defpackage.q30.a(r0, r7)
            return r5
        L39:
            if (r2 < r4) goto L44
            boolean r8 = defpackage.n30.b(r0, r8)
            if (r8 == 0) goto L44
            t30 r5 = defpackage.t30.c
            return r5
        L44:
            ix6 r8 = new ix6
            r0 = 4
            r8.<init>(r0)
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.a(r0)
            r0 = 29
            r1 = 10
            if (r2 < r0) goto L83
            boolean r0 = defpackage.oaf.P(r5)
            if (r0 != 0) goto L6a
            if (r2 < r4) goto L83
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L83
        L6a:
            zw6 r5 = defpackage.p30.a(r7)
            r8.k(r5)
            t30 r5 = new t30
            jx6 r6 = r8.l()
            int[] r6 = defpackage.s5c.c0(r6)
            ffc r6 = a(r1, r6)
            r5.<init>(r6)
            return r5
        L83:
            android.content.ContentResolver r5 = r5.getContentResolver()
            java.lang.String r7 = "use_external_surround_sound_flag"
            r0 = 0
            int r7 = android.provider.Settings.Global.getInt(r5, r7, r0)
            r2 = 1
            if (r7 != r2) goto L93
            r7 = r2
            goto L94
        L93:
            r7 = r0
        L94:
            if (r7 != 0) goto La8
            java.lang.String r3 = defpackage.oaf.c
            java.lang.String r4 = "Amazon"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto La8
            java.lang.String r4 = "Xiaomi"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Lb5
        La8:
            java.lang.String r3 = "external_surround_sound_enabled"
            int r5 = android.provider.Settings.Global.getInt(r5, r3, r0)
            if (r5 != r2) goto Lb5
            ffc r5 = defpackage.t30.d
            r8.k(r5)
        Lb5:
            if (r6 == 0) goto Le8
            if (r7 != 0) goto Le8
            java.lang.String r5 = "android.media.extra.AUDIO_PLUG_STATE"
            int r5 = r6.getIntExtra(r5, r0)
            if (r5 != r2) goto Le8
            java.lang.String r5 = "android.media.extra.ENCODINGS"
            int[] r5 = r6.getIntArrayExtra(r5)
            if (r5 == 0) goto Ld0
            java.util.List r5 = defpackage.s5c.i(r5)
            r8.k(r5)
        Ld0:
            t30 r5 = new t30
            jx6 r7 = r8.l()
            int[] r7 = defpackage.s5c.c0(r7)
            java.lang.String r8 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r6 = r6.getIntExtra(r8, r1)
            ffc r6 = a(r6, r7)
            r5.<init>(r6)
            return r5
        Le8:
            t30 r5 = new t30
            jx6 r6 = r8.l()
            int[] r6 = defpackage.s5c.c0(r6)
            ffc r6 = a(r1, r6)
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t30.c(android.content.Context, android.content.Intent, h30, g40):t30");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(defpackage.h30 r14, defpackage.qy5 r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t30.d(h30, qy5):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019 A[EDGE_INSN: B:13:0x0019->B:27:0x004a BREAK  A[LOOP:0: B:21:0x0032->B:25:0x0047]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof defpackage.t30
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t30 r9 = (defpackage.t30) r9
            android.util.SparseArray r1 = r8.a
            android.util.SparseArray r3 = r9.a
            int r4 = defpackage.oaf.a
            if (r1 != 0) goto L17
            if (r3 != 0) goto L19
            goto L49
        L17:
            if (r3 != 0) goto L1b
        L19:
            r1 = r2
            goto L4a
        L1b:
            int r4 = defpackage.oaf.a
            r5 = 31
            if (r4 < r5) goto L26
            boolean r1 = defpackage.jd8.z(r1, r3)
            goto L4a
        L26:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L31
            goto L19
        L31:
            r5 = r2
        L32:
            if (r5 >= r4) goto L49
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L47
            goto L19
        L47:
            int r5 = r5 + r0
            goto L32
        L49:
            r1 = r0
        L4a:
            if (r1 == 0) goto L53
            int r8 = r8.b
            int r9 = r9.b
            if (r8 != r9) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t30.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        SparseArray sparseArray = this.a;
        if (oaf.a >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i = 0; i < sparseArray.size(); i++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i)) + ((sparseArray.keyAt(i) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }
}
