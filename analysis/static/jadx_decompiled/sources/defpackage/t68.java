package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public abstract class t68 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public t68(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = new AtomicReference(nz4.a);
        this.d = new khe(new zj7(10, this));
    }

    public void A(int i) {
    }

    public void B(int i) {
    }

    public void C() {
    }

    public void D() {
    }

    public void E(long j) {
    }

    public void F() {
    }

    public void G() throws InterruptedException {
        try {
            kpa kpaVarH = H();
            int iIntValue = ((Number) kpaVarH.a).intValue();
            o43 o43Var = (o43) kpaVarH.b;
            if (o43Var == null) {
                if (iIntValue == 0) {
                    zy zyVarB = b();
                    if (zyVarB.c.delete() && zyVarB.d.delete()) {
                        zyVarB.e.delete();
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                String strC = c();
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, strC, "saveProtoToFile " + ((List) ((AtomicReference) this.c).get()).size() + ", " + iIntValue + "bytes", null);
                }
                zy zyVarB2 = b();
                FileOutputStream fileOutputStreamF = zyVarB2.f();
                if (fileOutputStreamF != null) {
                    try {
                        fileOutputStreamF.write((byte[]) o43Var.e0(), 0, iIntValue);
                        zyVarB2.b(fileOutputStreamF);
                    } catch (Throwable th) {
                        zyVarB2.a(fileOutputStreamF);
                        throw th;
                    }
                }
                v3c.i(o43Var, null);
            } finally {
            }
        } catch (InterruptedException e) {
            throw e;
        } catch (Throwable th2) {
            hm9.p(c(), "failed to save state", th2);
        }
    }

    public kpa H() {
        qw8 qw8VarA = a();
        int serializedSize = qw8VarA.getSerializedSize();
        if (serializedSize == 0) {
            return new kpa(0, null);
        }
        v84 v84VarA = ((m5b) ((je7) this.b).getValue()).b().a(serializedSize);
        byte[] bArr = (byte[]) v84VarA.e0();
        String strC = c();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, strC, "serializeData: size=" + (bArr.length / LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) + "kb, bytes.ref=" + bArr + "}", null);
        }
        Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        qw8.toByteArray(qw8VarA, bArr, 0, serializedSize);
        return new kpa(Integer.valueOf(serializedSize), v84VarA);
    }

    public void I(th8 th8Var, Handler handler) {
        synchronized (this.a) {
            try {
                this.c = new WeakReference(th8Var);
                cy cyVar = (cy) this.d;
                cy cyVar2 = null;
                if (cyVar != null) {
                    cyVar.removeCallbacksAndMessages(null);
                }
                if (th8Var != null && handler != null) {
                    cyVar2 = new cy(this, handler.getLooper(), 12);
                }
                this.d = cyVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract qw8 a();

    public abstract zy b();

    public String c() {
        return (String) ((khe) this.d).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fb9
            if (r0 == 0) goto L13
            r0 = r7
            fb9 r0 = (defpackage.fb9) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            fb9 r0 = new fb9
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.od2.a0(r7)
            goto L87
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            t68 r6 = r0.o
            defpackage.od2.a0(r7)
            goto L60
        L39:
            defpackage.od2.a0(r7)
            zy r7 = r6.b()
            r0.o = r6
            r0.Z = r4
            java.lang.Object r2 = r6.a
            je7 r2 = (defpackage.je7) r2
            java.lang.Object r2 = r2.getValue()
            kke r2 = (defpackage.kke) r2
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            hb9 r4 = new hb9
            r4.<init>(r7, r6, r5)
            java.lang.Object r7 = defpackage.j47.t0(r2, r4, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            byte[] r7 = (byte[]) r7
            if (r7 != 0) goto L67
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L67:
            java.lang.Object r2 = r6.a
            je7 r2 = (defpackage.je7) r2
            java.lang.Object r2 = r2.getValue()
            kke r2 = (defpackage.kke) r2
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.a()
            gb9 r4 = new gb9
            r4.<init>(r6, r7, r5)
            r0.o = r5
            r0.Z = r3
            java.lang.Object r7 = defpackage.j47.t0(r2, r4, r0)
            if (r7 != r1) goto L87
            return r1
        L87:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t68.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract Boolean e(byte[] bArr);

    public void f(ja8 ja8Var) {
    }

    public void g(ja8 ja8Var, int i) {
    }

    public void h(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void i(String str, Bundle bundle) {
    }

    public void j() {
    }

    public boolean k(Intent intent) {
        return false;
    }

    public void l() {
    }

    public void m() {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(Uri uri, Bundle bundle) {
    }

    public void q() {
    }

    public void r(String str, Bundle bundle) {
    }

    public void s(String str, Bundle bundle) {
    }

    public void t(Uri uri, Bundle bundle) {
    }

    public void u(ja8 ja8Var) {
    }

    public void v() {
    }

    public void w(long j) {
    }

    public void x(float f) {
    }

    public void y(h5c h5cVar) {
    }

    public void z(h5c h5cVar) {
    }

    public t68(cj8 cj8Var) {
        this.d = cj8Var;
        this.a = new ArrayList();
    }

    public t68() {
        this.a = new Object();
        this.b = new sh8(this);
        this.c = new WeakReference(null);
    }
}
