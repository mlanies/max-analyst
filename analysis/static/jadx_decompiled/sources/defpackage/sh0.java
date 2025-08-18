package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class sh0 implements u4, edc, agf, ipf {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ sh0(char c, int i) {
        this.a = i;
    }

    public static ng9 H() {
        sm9 sm9Var = sm9.a;
        sm9Var.getClass();
        return new ng9(sm9Var);
    }

    public void A() {
        p42 p42Var = p42.c;
        char[] cArr = (char[]) this.c;
        synchronized (p42Var) {
            int i = p42Var.a;
            if (cArr.length + i < vs.a) {
                p42Var.a = i + cArr.length;
                ((hs) p42Var.b).b(cArr);
            }
        }
    }

    public synchronized void B(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.b);
            sb.append(" base apk paths.");
            if (this.b > 0) {
                sb.append(" Most recent ones:");
            }
            int i = 0;
            while (true) {
                String[] strArr = (String[]) this.c;
                if (i < strArr.length) {
                    int i2 = (this.b - i) - 1;
                    if (i2 >= 0) {
                        String str = strArr[i2 % strArr.length];
                        sb.append("\n");
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public l2a C(int i) {
        dj3 dj3Var = (dj3) this.c;
        int i2 = this.b;
        dj3Var.d(i2, 6, i, 7);
        return new l2a(dj3Var, 6, i2, 4);
    }

    public l2a D(int i) {
        dj3 dj3Var = (dj3) this.c;
        int i2 = this.b;
        dj3Var.d(i2, 6, i, 6);
        return new l2a(dj3Var, 6, i2, 4);
    }

    public l2a E(int i) {
        dj3 dj3Var = (dj3) this.c;
        int i2 = this.b;
        dj3Var.d(i2, 3, i, 4);
        return new l2a(dj3Var, 3, i2, 4);
    }

    @Override // defpackage.agf
    public void F(long j) {
    }

    public l2a G(int i) {
        dj3 dj3Var = (dj3) this.c;
        int i2 = this.b;
        dj3Var.d(i2, 3, i, 3);
        return new l2a(dj3Var, 3, i2, 4);
    }

    public void I() {
        ((dj3) this.c).g(this.b).d.W = 2;
    }

    public void J(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        r(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    @Override // defpackage.agf
    public void K() {
    }

    @Override // defpackage.agf
    public void O() {
        m1f m1fVar = (m1f) this.c;
        int i = this.b;
        kf4 kf4Var = m1fVar.A0;
        kf4Var.getClass();
        synchronized (kf4Var) {
            try {
                fm9.k(oaf.l(kf4Var.g, i));
                boolean z = false;
                fm9.k(kf4Var.o != -1);
                ((jf4) kf4Var.g.get(i)).b = true;
                int i2 = 0;
                while (true) {
                    if (i2 >= kf4Var.g.size()) {
                        z = true;
                        break;
                    } else if (!((jf4) kf4Var.g.valueAt(i2)).b) {
                        break;
                    } else {
                        i2++;
                    }
                }
                kf4Var.h = z;
                if (((jf4) kf4Var.g.get(kf4Var.o)).a.isEmpty()) {
                    if (i == kf4Var.o) {
                        kf4Var.d();
                    }
                    if (z) {
                        kf4Var.a.z();
                        return;
                    }
                }
                if (i != kf4Var.o && ((jf4) kf4Var.g.get(i)).a.size() == 1) {
                    kf4Var.f.v(new ff4(kf4Var, 2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ipf
    public cn9 a(int i) {
        cn9 cn9Var = (cn9) ((SparseArray) this.c).get(i);
        if (cn9Var != null) {
            return cn9Var;
        }
        throw new IllegalArgumentException(zr6.h(i, "Cannot find the wrapper for global view type "));
    }

    @Override // defpackage.u4
    public boolean b(View view) {
        ((BottomSheetBehavior) this.c).K(this.b);
        return true;
    }

    @Override // defpackage.agf
    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        m1f m1fVar = (m1f) this.c;
        m1fVar.getClass();
        m1fVar.Y.execute(new vs5(m1fVar, 28, videoFrameProcessingException));
    }

    @Override // defpackage.ipf
    public hpf d(cn9 cn9Var) {
        c8d c8dVar = new c8d();
        c8dVar.o = this;
        c8dVar.a = new SparseIntArray(1);
        c8dVar.b = new SparseIntArray(1);
        c8dVar.c = cn9Var;
        return c8dVar;
    }

    public l2a e(int i) {
        dj3 dj3Var = (dj3) this.c;
        int i2 = this.b;
        dj3Var.d(i2, 4, i, 4);
        return new l2a(dj3Var, 4, i2, 4);
    }

    public l2a f(int i) {
        dj3 dj3Var = (dj3) this.c;
        int i2 = this.b;
        dj3Var.d(i2, 4, i, 3);
        return new l2a(dj3Var, 4, i2, 4);
    }

    public pg9 g() {
        Map mapG = ((kq0) this.c).g();
        og9 og9Var = new og9(this.b);
        pg9 pg9Var = new pg9(mapG);
        pg9Var.Y = og9Var;
        return pg9Var;
    }

    public void h() {
        ((dj3) this.c).g(this.b).d.l0 = true;
    }

    public void i(InputStream inputStream, OutputStream outputStream) {
        ja6 ja6Var = (ja6) this.c;
        int i = this.b;
        byte[] bArr = (byte[]) ja6Var.get(i);
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, i);
                if (i2 == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i2);
                }
            } finally {
                ja6Var.e(bArr);
            }
        }
    }

    public int j() {
        m71 m71Var = (m71) this.c;
        int i = m71Var.L0.a;
        int i2 = this.b;
        if (i != 0) {
            return i2;
        }
        if (m71Var.I0.j() == 0 || m71Var.I0.j() == 1) {
            return 1;
        }
        if (m71Var.I0.j() == 2) {
            return 2;
        }
        return i2;
    }

    public nt9 k(qh8 qh8Var, c73 c73Var) {
        y9d y9dVar = c73Var.a;
        fm9.f(y9dVar != null && y9dVar.a == 0);
        y9dVar.getClass();
        Service service = (Service) this.c;
        IconCompat iconCompatC = IconCompat.c(service, c73Var.d);
        Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
        intent.setData(qh8Var.a.b);
        intent.setComponent(new ComponentName(service, service.getClass()));
        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", y9dVar.b);
        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", y9dVar.c);
        int i = this.b + 1;
        this.b = i;
        return new nt9(iconCompatC, c73Var.f, PendingIntent.getService(service, i, intent, 134217728 | (oaf.a >= 23 ? 67108864 : 0)));
    }

    public nt9 l(qh8 qh8Var, IconCompat iconCompat, CharSequence charSequence, int i) {
        return new nt9(iconCompat, charSequence, m(qh8Var, i));
    }

    public PendingIntent m(qh8 qh8Var, long j) {
        int i = (j == 8 || j == 9) ? 87 : (j == 6 || j == 7) ? 88 : j == 3 ? 86 : j == 12 ? 90 : j == 11 ? 89 : j == 1 ? 85 : 0;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(qh8Var.a.b);
        Service service = (Service) this.c;
        intent.setComponent(new ComponentName(service, service.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        int i2 = oaf.a;
        if (i2 < 26 || j != 1 || qh8Var.c().u()) {
            return PendingIntent.getService(service, i, intent, i2 >= 23 ? 67108864 : 0);
        }
        return PendingIntent.getForegroundService(service, i, intent, 67108864);
    }

    public l2a n(int i) {
        dj3 dj3Var = (dj3) this.c;
        int i2 = this.b;
        dj3Var.d(i2, 7, i, 7);
        return new l2a(dj3Var, 7, i2, 4);
    }

    @Override // defpackage.agf
    public void o(int i, int i2) {
    }

    public l2a p(int i) {
        dj3 dj3Var = (dj3) this.c;
        int i2 = this.b;
        dj3Var.d(i2, 7, i, 6);
        return new l2a(dj3Var, 7, i2, 4);
    }

    @Override // defpackage.edc
    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, nud[] nudVarArr) {
        int i;
        edc[] edcVarArr;
        do {
            i = this.b;
            edcVarArr = (edc[]) this.c;
            if (i >= edcVarArr.length) {
                return false;
            }
            this.b = i + 1;
        } while (!edcVarArr[i].q(unsatisfiedLinkError, nudVarArr));
        return true;
    }

    public void r(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public void s(es8 es8Var, long j) {
        e52 e52VarC = ((jyc) ((fke) this.c)).f().C(es8Var.a.t0);
        List listSingletonList = Collections.singletonList(es8Var);
        if (e52VarC == null) {
            hm9.o("sh0", "Chat can't be null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", e52VarC.a);
        bundle.putLong("ru.ok.tamtam.extra.ATTACH_ID", j);
        bundle.putBoolean("ru.ok.tamtam.extra.NOTIFY", true);
        ArrayList arrayList = new ArrayList(listSingletonList.size());
        Iterator it = listSingletonList.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Long.valueOf(((es8) it.next()).a.b));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
    }

    public int t() {
        int i = this.b;
        if (i != 0) {
            return ((int[]) this.c)[i - 1];
        }
        throw new NoSuchElementException();
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public int u() {
        int i = this.b;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.c;
        int i2 = i - 1;
        this.b = i2;
        return iArr[i2];
    }

    public void v(int i) {
        int i2 = this.b;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        ((int[]) this.c)[i2 - 1] = i;
    }

    public void w(int i) {
        int[] iArr = (int[]) this.c;
        int length = iArr.length;
        if (this.b >= length) {
            int[] iArr2 = new int[length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.c = iArr2;
            iArr = iArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    public long x(ra4 ra4Var) {
        yaf yafVar = (yaf) this.c;
        int i = 0;
        ra4Var.q(yafVar.a, 0, 1, false);
        int i2 = yafVar.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        ra4Var.q(yafVar.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (yafVar.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public long y(sa4 sa4Var) {
        wpa wpaVar = (wpa) this.c;
        int i = 0;
        sa4Var.q(wpaVar.a, 0, 1, false);
        int i2 = wpaVar.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        sa4Var.q(wpaVar.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (wpaVar.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public synchronized boolean z(String str) {
        for (String str2 : (String[]) this.c) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        B(sb);
        String[] strArr = (String[]) this.c;
        int i = this.b;
        strArr[i % strArr.length] = str;
        this.b = i + 1;
        return true;
    }

    public /* synthetic */ sh0(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ sh0(int i, Serializable serializable, int i2) {
        this.a = i2;
        this.b = i;
        this.c = serializable;
    }

    public /* synthetic */ sh0(int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = 0;
    }

    public sh0(kq0 kq0Var) {
        this.a = 12;
        this.c = kq0Var;
        this.b = 2;
    }

    public sh0(int i, byte[] bArr) {
        this.a = 17;
        if (bArr == null) {
            throw new IllegalArgumentException("Illegal 'value' value: null");
        }
        if (i != 0) {
            this.c = bArr;
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("Illegal 'format' value: null");
    }

    public sh0(ph3 ph3Var, int i) {
        this.a = 22;
        fp3.n(ph3Var);
        this.c = ph3Var;
        this.b = i;
    }

    public sh0(int i, byte b) {
        this.a = i;
        switch (i) {
            case 6:
                this.c = new Object();
                this.b = 0;
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                this.b = 50;
                break;
            case 18:
                this.c = new int[8];
                break;
            case 19:
                this.c = new yaf(8);
                break;
            case 20:
                this.c = new wpa(8);
                break;
            default:
                this.c = new String[5];
                this.b = 0;
                break;
        }
    }

    public sh0(ja6 ja6Var) {
        this.a = 15;
        od2.j(true);
        this.b = 16384;
        this.c = ja6Var;
    }

    public sh0(int i) {
        this.a = 11;
        ((y8a) vl.b()).p().getClass();
        fke fkeVarB = jke.b();
        this.c = fkeVarB;
        this.b = i;
        ((jyc) fkeVarB).b();
        ((y8a) vl.b()).g();
    }

    public sh0(Notification notification) {
        this.a = 10;
        this.b = MultiFileUploader.MSG_TRY_UPLOAD_NEXT;
        notification.getClass();
        this.c = notification;
    }
}
