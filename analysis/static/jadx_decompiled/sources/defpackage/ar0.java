package defpackage;

import androidx.appcompat.widget.ActionMenuView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.webrtc.VideoEncoderObserver;

/* loaded from: classes.dex */
public class ar0 implements ej5, a76, fd6, ed6, v15, VideoEncoderObserver, nr8 {
    public boolean a;
    public Object b;

    public /* synthetic */ ar0(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.fd6
    public synchronized void B(hd6 hd6Var, long j) {
        if (this.a) {
            ((jo7) this.b).B(hd6Var, j);
        }
    }

    @Override // defpackage.a76
    public void a(Object obj) {
        List list = (List) obj;
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        if (this.a) {
            arrayList.removeAll(Collections.singleton(null));
        }
        ((lq1) this.b).b(arrayList);
    }

    public void b(sq4 sq4Var) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        od2.m(size, arrayList.size() + 1);
        arrayList.add(size, sq4Var);
        if (this.a) {
            sq4Var.g();
        }
    }

    @Override // defpackage.nr8
    public void c(wq8 wq8Var, boolean z) {
        e7 e7Var;
        if (this.a) {
            return;
        }
        this.a = true;
        mwe mweVar = (mwe) this.b;
        ActionMenuView actionMenuView = mweVar.o.a.a;
        if (actionMenuView != null && (e7Var = actionMenuView.s0) != null) {
            e7Var.f();
            b7 b7Var = e7Var.E0;
            if (b7Var != null && b7Var.b()) {
                b7Var.j.dismiss();
            }
        }
        mweVar.X.onPanelClosed(108, wq8Var);
        this.a = false;
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        boolean z = th instanceof TimeoutException;
        lq1 lq1Var = (lq1) this.b;
        if (z) {
            lq1Var.d(th);
        } else {
            lq1Var.b(Collections.emptyList());
        }
    }

    @Override // defpackage.v15
    public void e() {
        if (this.a) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(new dmd(i));
        }
        ((y51) this.b).E(arrayList);
    }

    @Override // defpackage.ej5
    public void f(File file) {
        o94 o94Var;
        m94 m94VarG;
        if (this.a && (m94VarG = o94.g((o94Var = (o94) this.b), file)) != null) {
            String str = m94VarG.b;
            if (str != ".tmp") {
                od2.p(str == ".cnt");
                return;
            }
            long jLastModified = file.lastModified();
            o94Var.e.getClass();
            if (jLastModified > System.currentTimeMillis() - o94.f) {
                return;
            }
        }
        file.delete();
    }

    @Override // defpackage.v15
    public void g() {
        if (this.a) {
            this.a = false;
            ((y51) this.b).E(nz4.a);
        }
    }

    @Override // defpackage.ed6
    public void h() {
        if (this.a) {
            ((jo7) this.b).h();
        }
    }

    public sq4 i(int i) {
        return (sq4) ((ArrayList) this.b).get(i);
    }

    @Override // defpackage.ej5
    public void j(File file) {
        if (this.a || !file.equals(((o94) this.b).c)) {
            return;
        }
        this.a = true;
    }

    public void k() {
        this.a = true;
    }

    public void l() {
        this.a = false;
    }

    @Override // defpackage.ej5
    public void m(File file) {
        o94 o94Var = (o94) this.b;
        if (!o94Var.a.equals(file) && !this.a) {
            file.delete();
        }
        if (this.a && file.equals(o94Var.c)) {
            this.a = false;
        }
    }

    public void n() {
        this.a = false;
    }

    @Override // defpackage.nr8
    public boolean o(wq8 wq8Var) {
        ((mwe) this.b).X.onMenuOpened(108, wq8Var);
        return true;
    }

    @Override // org.webrtc.VideoEncoderObserver
    public void onEncoderChanged(VideoEncoderObserver.EncoderInfo encoderInfo) {
        nsa nsaVar = (nsa) this.b;
        a4c a4cVar = nsaVar.K0;
        StringBuilder sb = new StringBuilder("Encoder for ");
        boolean z = this.a;
        sb.append(z ? "camera" : "screen share");
        sb.append(" updated: ");
        sb.append(encoderInfo.getEncoderType());
        sb.append(", ");
        sb.append(encoderInfo.getImplementationName());
        sb.append(", isHw: ");
        sb.append(encoderInfo.isHardwareAccelerated());
        a4cVar.log("PCRTCClient", sb.toString());
        if (z) {
            nsaVar.i("onCameraEncoderInfoChanged", new adg(nsaVar, new gsa(this, 5, encoderInfo), 1));
        }
    }

    public void p() {
        if (this.a) {
            return;
        }
        this.a = true;
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((sq4) arrayList.get(i)).g();
            i++;
        }
    }

    @Override // defpackage.fd6
    public synchronized void q() {
        if (this.a) {
            ((jo7) this.b).q();
        }
    }

    public void r() {
        if (!this.a) {
            return;
        }
        int i = 0;
        this.a = false;
        while (true) {
            ArrayList arrayList = (ArrayList) this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((sq4) arrayList.get(i)).h();
            i++;
        }
    }

    @Override // org.webrtc.VideoEncoderObserver
    public void release() {
        ((nsa) this.b).K0.log("PCRTCClient", "Encoder observer released isCamera=(" + this.a + ")");
    }

    @Override // defpackage.ed6
    public void s(hd6 hd6Var) {
        if (this.a) {
            ((jo7) this.b).s(hd6Var);
        }
    }

    public void t(char c) {
        sh0 sh0Var = (sh0) this.b;
        sh0Var.r(sh0Var.b, 1);
        char[] cArr = (char[]) sh0Var.c;
        int i = sh0Var.b;
        sh0Var.b = i + 1;
        cArr[i] = c;
    }

    public void u(String str) {
        ((sh0) this.b).J(str);
    }

    @Override // defpackage.ed6
    public synchronized void v() {
        if (this.a) {
            ((jo7) this.b).v();
        }
    }

    public void w(String str) {
        byte b;
        sh0 sh0Var = (sh0) this.b;
        sh0Var.getClass();
        sh0Var.r(sh0Var.b, str.length() + 2);
        char[] cArr = (char[]) sh0Var.c;
        int i = sh0Var.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = r9e.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    sh0Var.r(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = r9e.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) sh0Var.c)[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str2 = r9e.a[cCharAt];
                            sh0Var.r(i4, str2.length());
                            str2.getChars(0, str2.length(), (char[]) sh0Var.c, i4);
                            int length3 = str2.length() + i4;
                            sh0Var.b = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = (char[]) sh0Var.c;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            sh0Var.b = i4;
                        }
                    }
                }
                sh0Var.r(i4, 1);
                ((char[]) sh0Var.c)[i4] = '\"';
                sh0Var.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        sh0Var.b = i3 + 1;
    }

    public void x() {
    }

    public void y() {
    }

    public /* synthetic */ ar0(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public ar0(boolean z, r38 r38Var) {
        this.a = z;
        this.b = r38Var;
    }

    public ar0(sh0 sh0Var) {
        this.b = sh0Var;
        this.a = true;
    }

    public ar0() {
        this.a = false;
        this.b = new ArrayList();
    }
}
