package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import android.widget.EditText;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.ProcessingException;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import com.facebook.soloader.NoBaseApkException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import one.me.deeplink.InvalidDeeplinkNamingException;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class y7g implements qj3, edc, ab3, a76, en6, qq6, lq8, pic, qv6 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ y7g(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public static aa4 v(br7 br7Var) {
        ib4 ib4Var = new ib4();
        ib4Var.b = null;
        br7Var.getClass();
        br7Var.getClass();
        w36 w36Var = new w36();
        np8.d(true);
        w36Var.b = ib4Var;
        w36Var.c = null;
        w36Var.a = false;
        w36Var.o = new HashMap();
        br7Var.getClass();
        throw null;
    }

    public wmc A() {
        mgg mggVar;
        try {
            if (((wmc) this.c) == null) {
                eig eigVar = (eig) this.b;
                Parcel parcelR = eigVar.R(eigVar.G0(), 25);
                IBinder strongBinder = parcelR.readStrongBinder();
                if (strongBinder == null) {
                    mggVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    mggVar = iInterfaceQueryLocalInterface instanceof mgg ? (mgg) iInterfaceQueryLocalInterface : new mgg(strongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 3);
                }
                parcelR.recycle();
                this.c = new wmc(mggVar, false);
            }
            return (wmc) this.c;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void B(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, p3c.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(p3c.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(p3c.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            F(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void C(ox5 ox5Var) {
        int i = ox5Var.b;
        Handler handler = (Handler) this.c;
        mfe mfeVar = (mfe) this.b;
        if (i != 0) {
            handler.post(new zj0(i, 1, mfeVar));
        } else {
            handler.post(new i76(mfeVar, 2, ox5Var.a));
        }
    }

    public void D(Object obj, String str) {
        ((ArrayList) this.c).add(str + "=" + obj);
    }

    public void E(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        messageObtain.replyTo = messenger;
        ((Messenger) this.b).send(messageObtain);
    }

    public void F(boolean z) {
        qy4 qy4Var = (qy4) ((bx4) this.c).a.c;
        if (qy4Var.Y != z) {
            if (qy4Var.c != null) {
                vw4 vw4VarA = vw4.a();
                oy4 oy4Var = qy4Var.c;
                vw4VarA.getClass();
                c54.o(oy4Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = vw4VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    vw4VarA.b.remove(oy4Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            qy4Var.Y = z;
            if (z) {
                qy4.a(qy4Var.a, vw4.a().b());
            }
        }
    }

    public void G(wy7 wy7Var) {
        try {
            eig eigVar = (eig) this.b;
            Parcel parcelG0 = eigVar.G0();
            agg.b(parcelG0, wy7Var);
            Parcel parcelR = eigVar.R(parcelG0, 91);
            parcelR.readInt();
            parcelR.recycle();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void H(z16 z16Var) {
        eig eigVar = (eig) this.b;
        try {
            if (z16Var == null) {
                Parcel parcelG0 = eigVar.G0();
                agg.c(parcelG0, null);
                eigVar.H0(parcelG0, 28);
            } else {
                xeg xegVar = new xeg(z16Var, (byte) 0);
                Parcel parcelG02 = eigVar.G0();
                agg.c(parcelG02, xegVar);
                eigVar.H0(parcelG02, 28);
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void I(z16 z16Var) {
        eig eigVar = (eig) this.b;
        try {
            if (z16Var == null) {
                Parcel parcelG0 = eigVar.G0();
                agg.c(parcelG0, null);
                eigVar.H0(parcelG0, 30);
            } else {
                xeg xegVar = new xeg(z16Var);
                Parcel parcelG02 = eigVar.G0();
                agg.c(parcelG02, xegVar);
                eigVar.H0(parcelG02, 30);
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.a76
    public void a(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                kee keeVar = (kee) obj;
                keeVar.getClass();
                try {
                    ((lee) ((o23) this.c).a).c(keeVar);
                    break;
                } catch (ProcessingException unused) {
                    return;
                }
            default:
                ((Surface) this.b).release();
                ((SurfaceTexture) this.c).release();
                break;
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        Iterator it = ((o20) this.b).g.iterator();
        while (it.hasNext()) {
            ts8 ts8Var = (ts8) ((s00) it.next());
            k8g k8gVar = ts8Var.w0;
            if (k8gVar != null && k8gVar.i() == 1) {
                l20 l20VarH = ts8Var.w0.h(0);
                g20 g20Var = l20VarH.a;
                g20 g20Var2 = g20.o;
                if (g20Var == g20Var2 || s5c.P(l20VarH)) {
                    if (TextUtils.equals(l20VarH.r, ((l20) this.c).r) && ts8Var.w0.i() == 1) {
                        l20 l20VarH2 = ts8Var.w0.h(0);
                        if (l20VarH2.a == g20Var2 || s5c.P(l20VarH2)) {
                            sq4 sq4VarI = ts8Var.o.i(0);
                            if (sq4VarI != null) {
                                e2b e2bVarA = s36.a.get();
                                e2bVarA.e = wv6.a(ts8Var.M0.a(l20VarH2));
                                e2bVarA.l = sq4VarI.X;
                                sq4VarI.i(e2bVarA.a());
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ab3
    public void b() {
        ab3 ab3Var = (ab3) this.b;
        try {
            ((qj3) ((qa3) this.c).c).accept(null);
            ab3Var.b();
        } catch (Throwable th) {
            c37.B(th);
            ab3Var.onError(th);
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public void c(zl4 zl4Var) {
        ((ab3) this.b).c(zl4Var);
    }

    @Override // defpackage.qv6
    public void close() {
        ((qv6) this.b).close();
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                int i = ((iee) this.b).f;
                if (i == 2 && (th instanceof CancellationException)) {
                    return;
                }
                v3c.o(i);
                return;
            default:
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    @Override // defpackage.pic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.c
            nw7 r4 = (defpackage.nw7) r4
            java.lang.Object r3 = r3.b
            iy3 r3 = (defpackage.iy3) r3
            r4.getClass()
            r3.getClass()
            monitor-enter(r4)
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L56
            int r0 = r3.c     // Catch: java.lang.Throwable -> L5a
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L18
            r0 = r2
            goto L19
        L18:
            r0 = r1
        L19:
            defpackage.od2.p(r0)     // Catch: java.lang.Throwable -> L5a
            int r0 = r3.c     // Catch: java.lang.Throwable -> L5a
            int r0 = r0 - r2
            r3.c = r0     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L56
            boolean r0 = r3.d     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L37
            int r0 = r3.c     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L37
            jn r0 = r4.b     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r3.a     // Catch: java.lang.Throwable -> L35
            r0.J(r1, r3)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            r1 = r2
            goto L38
        L35:
            r3 = move-exception
            goto L58
        L37:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
        L38:
            o43 r0 = r4.g(r3)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            defpackage.o43.S(r0)
            if (r1 == 0) goto L43
            goto L44
        L43:
            r3 = 0
        L44:
            if (r3 == 0) goto L4f
            w4d r0 = r3.e
            if (r0 == 0) goto L4f
            java.lang.Object r3 = r3.a
            r0.I(r3, r2)
        L4f:
            r4.e()
            r4.c()
            return
        L56:
            r3 = move-exception
            goto L5d
        L58:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            throw r3     // Catch: java.lang.Throwable -> L56
        L5a:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5a
            throw r3     // Catch: java.lang.Throwable -> L56
        L5d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y7g.e(java.lang.Object):void");
    }

    @Override // defpackage.en6
    public zpa f() {
        return new qz7(((en6) this.b).f(), 19, (List) this.c);
    }

    @Override // defpackage.qv6
    public ov6 g() {
        return u(((qv6) this.b).g());
    }

    @Override // defpackage.lq8
    public o43 get(Object obj) {
        o43 o43Var = ((lq8) this.b).get(obj);
        nq8 nq8Var = (nq8) this.c;
        if (o43Var == null) {
            nq8Var.i(obj);
        } else {
            nq8Var.h(obj);
        }
        return o43Var;
    }

    @Override // defpackage.qq6
    public long getContentLength() {
        return ((File) this.c).length();
    }

    @Override // defpackage.qq6
    public String getContentType() {
        return (String) this.b;
    }

    @Override // defpackage.qv6
    public int getHeight() {
        return ((qv6) this.b).getHeight();
    }

    @Override // defpackage.lq8
    public int getSizeInBytes() {
        return ((lq8) this.b).getSizeInBytes();
    }

    @Override // defpackage.qv6
    public Surface getSurface() {
        return ((qv6) this.b).getSurface();
    }

    @Override // defpackage.qv6
    public int getWidth() {
        return ((qv6) this.b).getWidth();
    }

    @Override // defpackage.lq8
    public o43 h(Object obj, o43 o43Var) {
        ((nq8) this.c).n(obj);
        return ((lq8) this.b).h(obj, o43Var);
    }

    @Override // defpackage.en6
    public zpa i(ym6 ym6Var, qm6 qm6Var) {
        return new qz7(((en6) this.b).i(ym6Var, qm6Var), 19, (List) this.c);
    }

    @Override // defpackage.qv6
    public int j() {
        return ((qv6) this.b).j();
    }

    @Override // defpackage.qv6
    public void k() {
        ((qv6) this.b).k();
    }

    @Override // defpackage.qv6
    public void l(pv6 pv6Var, Executor executor) {
        ((qv6) this.b).l(new y98(this, 16, pv6Var), executor);
    }

    @Override // defpackage.qv6
    public int m() {
        return ((qv6) this.b).m();
    }

    @Override // defpackage.lq8
    public int n(d7b d7bVar) {
        return ((lq8) this.b).n(d7bVar);
    }

    @Override // defpackage.qv6
    public ov6 o() {
        return u(((qv6) this.b).o());
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public void onError(Throwable th) {
        try {
            ((qj3) ((qa3) this.c).c).accept(th);
        } catch (Throwable th2) {
            c37.B(th2);
            th = new CompositeException(th, th2);
        }
        ((ab3) this.b).onError(th);
    }

    public Size[] p(Size[] sizeArr, int i) {
        List listEmptyList;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(Arrays.asList(sizeArr));
        if (((ExtraSupportedOutputSizeQuirk) this.b) != null) {
            Size[] sizeArr2 = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr2.length > 0) {
                arrayList2.addAll(Arrays.asList(sizeArr2));
            }
        }
        qqd qqdVar = (qqd) this.c;
        qqdVar.getClass();
        if (((ExcludedSupportedSizesQuirk) zi4.a.e(ExcludedSupportedSizesQuirk.class)) == null) {
            listEmptyList = new ArrayList();
        } else {
            String str = (String) qqdVar.b;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            } else {
                if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && (i == 34 || i == 35)) {
                        arrayList.add(new Size(720, 720));
                        arrayList.add(new Size(HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST));
                    }
                } else {
                    if ("SAMSUNG".equalsIgnoreCase(str2) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                        arrayList = new ArrayList();
                        if (str.equals("0")) {
                            if (i == 34) {
                                arrayList.add(new Size(4128, 3096));
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            } else if (i == 35) {
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else if (str.equals("1") && (i == 34 || i == 35)) {
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2448, 2448));
                            arrayList.add(new Size(1920, 1920));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if ("SAMSUNG".equalsIgnoreCase(str2) && "J7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                        arrayList = new ArrayList();
                        if (str.equals("0")) {
                            if (i == 34) {
                                arrayList.add(new Size(4128, 3096));
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            } else if (i == 35) {
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else if (str.equals("1") && (i == 34 || i == 35)) {
                            arrayList.add(new Size(2576, 1932));
                            arrayList.add(new Size(2560, 1440));
                            arrayList.add(new Size(1920, 1920));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                        arrayList = new ArrayList();
                        if (str.equals("0") && i == 256) {
                            arrayList.add(new Size(9280, 6944));
                        }
                    } else {
                        listEmptyList = Collections.emptyList();
                    }
                }
            }
            listEmptyList = arrayList;
        }
        if (!listEmptyList.isEmpty()) {
            arrayList2.removeAll(listEmptyList);
        }
        arrayList2.isEmpty();
        return (Size[]) arrayList2.toArray(new Size[0]);
    }

    @Override // defpackage.edc
    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, nud[] nudVarArr) {
        String str = ((Context) this.b).getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            return false;
        }
        StringBuilder sbM = au1.m("Base apk does not exist: ", str, ". ");
        ((sh0) this.c).B(sbM);
        throw new NoBaseApkException(sbM.toString(), unsatisfiedLinkError);
    }

    public Uri r() {
        return c54.h(s(), "max", null);
    }

    public String s() {
        if (!eae.o0((String) this.b, ":", false)) {
            throw new InvalidDeeplinkNamingException((String) this.b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) this.b);
        sb.append('?');
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append('&');
        }
        sb.deleteCharAt(w9e.v0(sb));
        return sb.toString();
    }

    public void t() {
        this.b = null;
        this.c = null;
    }

    public ecd u(ov6 ov6Var) {
        nje njeVar;
        if (ov6Var == null) {
            return null;
        }
        if (((x9b) this.c) == null) {
            njeVar = nje.b;
        } else {
            x9b x9bVar = (x9b) this.c;
            Pair pair = new Pair(x9bVar.g, x9bVar.h.get(0));
            nje njeVar2 = nje.b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            njeVar = new nje(arrayMap);
        }
        this.c = null;
        return new ecd(ov6Var, new Size(ov6Var.getWidth(), ov6Var.getHeight()), new qv1(new ik5(null, njeVar, ov6Var.getImageInfo().getTimestamp())));
    }

    public byte[] w(c45 c45Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        try {
            dataOutputStream.writeBytes(c45Var.a);
            dataOutputStream.writeByte(0);
            String str = c45Var.b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c45Var.c);
            dataOutputStream.writeLong(c45Var.o);
            dataOutputStream.write(c45Var.X);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.qq6
    public void writeTo(OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream((File) this.c);
        try {
            ema.l(fileInputStream, outputStream, 8192);
            v3c.i(fileInputStream, null);
        } finally {
        }
    }

    public sr4 x(rb8 rb8Var) {
        rb8Var.b.getClass();
        rb8Var.b.getClass();
        return sr4.a;
    }

    public b y() {
        im imVar = (im) ((WeakReference) this.c).get();
        a aVar = (a) ((WeakReference) this.b).get();
        return (imVar != null || aVar == null) ? imVar : aVar.b0();
    }

    public KeyListener z(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((bx4) this.c).a.getClass();
        if (keyListener instanceof mx4) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new mx4(keyListener);
    }

    public /* synthetic */ y7g(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public y7g(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new vu4();
                break;
            case 13:
                this.b = "";
                this.c = new ArrayList();
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                this.b = new Object();
                break;
            case 16:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 18:
                break;
            case 28:
                this.b = new char[256];
                this.c = new byte[256];
                break;
            default:
                this.b = new AtomicReference(Float.valueOf(0.0f));
                this.c = new AtomicBoolean(false);
                break;
        }
    }

    public y7g(eig eigVar) {
        this.a = 19;
        new HashMap();
        new HashMap();
        fp3.n(eigVar);
        this.b = eigVar;
    }

    public y7g(File file) {
        this.a = 20;
        this.b = "application/octet-stream";
        this.c = file;
    }

    public y7g(k56 k56Var) {
        this.a = 4;
        this.b = k56Var;
        this.c = tu0.r(3, new x5(18, this));
    }

    public y7g(ed3 ed3Var) {
        this.a = 29;
        this.b = ed3Var;
        this.c = bk4.b();
    }

    public y7g(a aVar) {
        this.a = 12;
        this.b = new WeakReference(aVar);
        this.c = new WeakReference(null);
    }

    public y7g(ilc ilcVar) {
        this.a = 0;
        this.b = ilcVar;
        this.c = new x7g(ilcVar, 0);
    }

    public y7g(im imVar) {
        this.a = 12;
        this.c = new WeakReference(imVar);
        this.b = new WeakReference(null);
    }

    public y7g(String str) {
        this.a = 27;
        this.b = (ExtraSupportedOutputSizeQuirk) zi4.a.e(ExtraSupportedOutputSizeQuirk.class);
        this.c = new qqd(12, str);
    }

    public y7g(EditText editText) {
        this.a = 2;
        this.b = editText;
        this.c = new bx4(editText, false);
    }

    public y7g(td tdVar) {
        this.a = 26;
        this.b = tdVar;
    }

    public y7g(Context context, Object obj, LinkedHashSet linkedHashSet) {
        dx1 dx1Var;
        ex1 ex1Var;
        this.a = 8;
        nd2 nd2Var = new nd2(8);
        this.b = new HashMap();
        this.c = nd2Var;
        if (obj instanceof dx1) {
            dx1Var = (dx1) obj;
        } else {
            ay7.t();
            if (Build.VERSION.SDK_INT >= 30) {
                ex1Var = new fx1(context, null);
            } else {
                ex1Var = new ex1(context, null);
            }
            dx1Var = new dx1(ex1Var);
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((HashMap) this.b).put(str, new bee(context, str, dx1Var, (ht1) this.c));
        }
    }

    public y7g(fg fgVar) {
        this.a = 1;
        this.c = fgVar;
    }

    public y7g(IBinder iBinder, Bundle bundle) {
        this.a = 23;
        this.b = new Messenger(iBinder);
        this.c = bundle;
    }
}
