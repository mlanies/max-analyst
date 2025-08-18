package defpackage;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q30 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.t30 a(android.media.AudioManager r6, defpackage.h30 r7) {
        /*
            gaa r7 = r7.b()
            java.lang.Object r7 = r7.a
            android.media.AudioAttributes r7 = (android.media.AudioAttributes) r7
            java.util.List r6 = defpackage.e4.x(r6, r7)
            t30 r7 = new t30
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashSet r2 = new java.util.HashSet
            r3 = 12
            int[] r3 = new int[]{r3}
            java.util.List r3 = defpackage.s5c.i(r3)
            r2.<init>(r3)
            r0.put(r1, r2)
            r1 = 0
        L2b:
            int r2 = r6.size()
            if (r1 >= r2) goto L92
            java.lang.Object r2 = r6.get(r1)
            android.media.AudioProfile r2 = defpackage.m30.i(r2)
            int r3 = defpackage.m30.a(r2)
            r4 = 1
            if (r3 != r4) goto L41
            goto L8f
        L41:
            int r3 = defpackage.m30.y(r2)
            boolean r4 = defpackage.oaf.L(r3)
            if (r4 != 0) goto L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            cx6 r5 = defpackage.t30.e
            boolean r4 = r5.containsKey(r4)
            if (r4 != 0) goto L58
            goto L8f
        L58:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r0.containsKey(r4)
            if (r4 == 0) goto L7b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            r3.getClass()
            int[] r2 = defpackage.m30.x(r2)
            java.util.List r2 = defpackage.s5c.i(r2)
            r3.addAll(r2)
            goto L8f
        L7b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.HashSet r4 = new java.util.HashSet
            int[] r2 = defpackage.m30.x(r2)
            java.util.List r2 = defpackage.s5c.i(r2)
            r4.<init>(r2)
            r0.put(r3, r4)
        L8f:
            int r1 = r1 + 1
            goto L2b
        L92:
            ww6 r6 = defpackage.zw6.i()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L9e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc3
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r30 r2 = new r30
            java.lang.Object r3 = r1.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            r2.<init>(r3, r1)
            r6.a(r2)
            goto L9e
        Lc3:
            ffc r6 = r6.j()
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q30.a(android.media.AudioManager, h30):t30");
    }

    public static g40 b(AudioManager audioManager, h30 h30Var) {
        try {
            audioManager.getClass();
            List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) h30Var.b().a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new g40((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
