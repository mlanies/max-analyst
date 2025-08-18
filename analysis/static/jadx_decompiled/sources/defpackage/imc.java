package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Point;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.chats.search.ChatsListSearchScreen;
import org.apache.http.util.LangUtils;
import org.webrtc.DataChannel;
import ru.ok.android.webrtc.protocol.exceptions.RtcInternalHandleException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class imc implements i7, ao0, tge, bha, ab3, DataChannel.Observer, a76, dn6, vaf, erd, ik8, nr4, pma {
    public static d7g X;
    public static final Object o = new Object();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ imc(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public static ukg F(Context context, Intent intent, boolean z) {
        d7g d7gVar;
        synchronized (o) {
            try {
                if (X == null) {
                    X = new d7g(context);
                }
                d7gVar = X;
            } finally {
            }
        }
        if (!z) {
            return d7gVar.b(intent).j(new cs(2), new nc5(26));
        }
        if (c8d.r().v(context)) {
            synchronized (prf.b) {
                try {
                    prf.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        prf.c.a(prf.a);
                    }
                    d7gVar.b(intent).i(new gte(16, intent));
                } finally {
                }
            }
        } else {
            d7gVar.b(intent);
        }
        return j1e.r(-1);
    }

    public static zq4[] J(zq4 zq4Var, zq4 zq4Var2, zq4 zq4Var3) {
        float f = zq4Var.a;
        float f2 = zq4Var2.a;
        float f3 = f - f2;
        float f4 = zq4Var.b;
        float f5 = zq4Var2.b;
        float f6 = f4 - f5;
        float f7 = zq4Var3.a;
        float f8 = f2 - f7;
        float f9 = zq4Var3.b;
        float f10 = f5 - f9;
        float f11 = (f + f2) / 2.0f;
        float f12 = (f4 + f5) / 2.0f;
        float f13 = (f2 + f7) / 2.0f;
        float f14 = (f9 + f5) / 2.0f;
        float fSqrt = (float) Math.sqrt((f6 * f6) + (f3 * f3));
        float fSqrt2 = (float) Math.sqrt((f10 * f10) + (f8 * f8));
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float f17 = fSqrt2 / (fSqrt + fSqrt2);
        if (Float.isNaN(f17)) {
            f17 = 0.0f;
        }
        float f18 = zq4Var2.a - ((f15 * f17) + f13);
        float f19 = f5 - ((f16 * f17) + f14);
        return new zq4[]{new zq4(f11 + f18, f12 + f19), new zq4(f13 + f18, f14 + f19)};
    }

    @Override // defpackage.ik8
    public void A(int i, yj8 yj8Var, pc8 pc8Var) {
        Pair pairR = R(i, yj8Var);
        if (pairR != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new nk8(this, pairR, pc8Var, 0));
        }
    }

    @Override // defpackage.ao0
    public bm7 B(byte[] bArr) {
        byte[] bArr2;
        jo7 jo7Var = (jo7) this.c;
        if (jo7Var != null && (bArr2 = (byte[]) jo7Var.a) != null && Arrays.equals(bArr2, bArr)) {
            bm7 bm7Var = (bm7) ((jo7) this.c).c;
            fm9.l(bm7Var);
            return bm7Var;
        }
        bm7 bm7VarB = ((ao0) this.b).B(bArr);
        jo7 jo7Var2 = new jo7();
        jo7Var2.a = bArr;
        jo7Var2.b = null;
        jo7Var2.c = bm7VarB;
        this.c = jo7Var2;
        return bm7VarB;
    }

    @Override // defpackage.nr4
    public void C(int i, yj8 yj8Var) {
        Pair pairR = R(i, yj8Var);
        if (pairR != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new ok8(this, pairR, 3));
        }
    }

    @Override // defpackage.nr4
    public void D(int i, yj8 yj8Var) {
        Pair pairR = R(i, yj8Var);
        if (pairR != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new ok8(this, pairR, 1));
        }
    }

    @Override // defpackage.dn6
    public ypa E(xm6 xm6Var, pm6 pm6Var) {
        return new ph4(((dn6) this.b).E(xm6Var, pm6Var), (List) this.c);
    }

    @Override // defpackage.i7
    public boolean G(j7 j7Var, Menu menu) {
        ViewGroup viewGroup = ((dn) this.c).L0;
        WeakHashMap weakHashMap = zmf.a;
        mmf.c(viewGroup);
        return ((i7) this.b).G(j7Var, menu);
    }

    @Override // defpackage.nr4
    public void H(int i, yj8 yj8Var) {
        Pair pairR = R(i, yj8Var);
        if (pairR != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new ok8(this, pairR, 2));
        }
    }

    @Override // defpackage.bha
    public void I(CharSequence charSequence) {
        String string;
        bc7[] bc7VarArr = ChatsListSearchScreen.J0;
        gw2 gw2VarN0 = ((ChatsListSearchScreen) this.b).n0();
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        q0e q0eVar = gw2VarN0.E0;
        if (string.equals(((ov2) q0eVar.getValue()).b)) {
            hm9.n(gw2VarN0.J0, "Same query for search, ignore it");
            return;
        }
        String str = ((ov2) q0eVar.getValue()).b;
        q0eVar.m(null, new ov2(nv2.a, string, it6.d, (string.length() <= 0 || !w9e.T0(string, str != null ? str : "")) ? nz4.a : ((ov2) q0eVar.getValue()).d, true));
        if (string.length() == 0) {
            gw2VarN0.t(false);
            return;
        }
        vxd vxdVar = gw2VarN0.M0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        gw2VarN0.o.d();
        vxd vxdVar2 = gw2VarN0.N0;
        if (vxdVar2 != null) {
            vxdVar2.cancel((CancellationException) null);
        }
        x77 x77Var = (x77) gw2VarN0.P0.T0(gw2VarN0, gw2.Q0[0]);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        gw2VarN0.G0.m(null, string);
    }

    public void K() {
        bkb bkbVar = (bkb) this.b;
        if (bkbVar != null) {
            ((AtomicBoolean) bkbVar.b).set(true);
            ((ScheduledFuture) bkbVar.a).cancel(true);
        }
        this.b = null;
    }

    @Override // defpackage.ik8
    public void L(int i, yj8 yj8Var, pc8 pc8Var) {
        Pair pairR = R(i, yj8Var);
        if (pairR != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new nk8(this, pairR, pc8Var, 1));
        }
    }

    public void M(Object obj, String str) {
        HashMap map = (HashMap) this.b;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.c).remove(str);
    }

    public void N() {
        this.b = null;
        this.c = null;
    }

    public s9 O() {
        return new s9((xq4) this.b);
    }

    public boolean P(int i) {
        return ((tm5) this.b).a.get(i);
    }

    public Bitmap Q(Uri uri, boolean z) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = (ContentResolver) this.b;
        ParcelFileDescriptor parcelFileDescriptor = null;
        bitmapDecodeFile = null;
        Bitmap bitmapDecodeFile = null;
        try {
            parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            try {
                try {
                    FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                    ph4 ph4Var = j47.X;
                    int iE = new c65(fileDescriptor).e(1, "Orientation");
                    parcelFileDescriptorOpenFileDescriptor.close();
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = contentResolver.openFileDescriptor(uri, "r");
                    Point pointD = j47.D(parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor(), iE);
                    parcelFileDescriptorOpenFileDescriptor2.close();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    if (z) {
                        options.inMutable = true;
                    }
                    options.inSampleSize = j47.I(pointD, 2048, 2048);
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    int iK = j47.K(iE);
                    if (iK == 0) {
                        s5c.m(parcelFileDescriptorOpenFileDescriptor);
                        return bitmapDecodeFileDescriptor;
                    }
                    Matrix matrix = new Matrix();
                    matrix.setRotate(iK);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFileDescriptor, 0, 0, bitmapDecodeFileDescriptor.getWidth(), bitmapDecodeFileDescriptor.getHeight(), matrix, true);
                    bitmapDecodeFileDescriptor.recycle();
                    s5c.m(parcelFileDescriptorOpenFileDescriptor);
                    return bitmapCreateBitmap;
                } catch (IOException e) {
                    e = e;
                    if (!(e instanceof FileNotFoundException)) {
                        hm9.p("imc", "getBitmapFromPath: failed to get bitmap", e);
                        s5c.m(parcelFileDescriptorOpenFileDescriptor);
                        return null;
                    }
                    String string = uri.toString();
                    try {
                        if (new File(string).exists()) {
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            if (z) {
                                options2.inMutable = true;
                            }
                            bitmapDecodeFile = BitmapFactory.decodeFile(string, options2);
                        } else {
                            hm9.k0("imc", null, "file by path %s not exists", Arrays.copyOf(new Object[]{string}, 1));
                        }
                    } catch (Throwable th) {
                        hm9.l0("imc", "getBitmapFromExternalStorage fail", th);
                    }
                    s5c.m(parcelFileDescriptorOpenFileDescriptor);
                    return bitmapDecodeFile;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                s5c.m(parcelFileDescriptor);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            parcelFileDescriptorOpenFileDescriptor = null;
        } catch (Throwable th3) {
            th = th3;
            s5c.m(parcelFileDescriptor);
            throw th;
        }
    }

    public Pair R(int i, yj8 yj8Var) {
        yj8 yj8VarA;
        tk8 tk8Var = (tk8) this.b;
        yj8 yj8Var2 = null;
        if (yj8Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= tk8Var.c.size()) {
                    yj8VarA = null;
                    break;
                }
                if (((yj8) tk8Var.c.get(i2)).d == yj8Var.d) {
                    Object obj = tk8Var.b;
                    int i3 = b5b.n;
                    yj8VarA = yj8Var.a(Pair.create(obj, yj8Var.a));
                    break;
                }
                i2++;
            }
            if (yj8VarA == null) {
                return null;
            }
            yj8Var2 = yj8VarA;
        }
        return Pair.create(Integer.valueOf(i + tk8Var.d), yj8Var2);
    }

    public synchronized Map S() {
        try {
            if (((Map) this.c) == null) {
                this.c = Collections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.c;
    }

    public void T(List list) {
        n4e n4eVar = (n4e) ((khe) this.c).getValue();
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d2e d2eVar = (d2e) it.next();
            arrayList.add(new u2e(0L, d2eVar.a, d2eVar.b, d2eVar.c, d2eVar.o, d2eVar.X, d2eVar.Y, d2eVar.Z, d2eVar.s0, d2eVar.t0, d2eVar.u0, d2eVar.v0, d2eVar.w0, d2eVar.x0, d2eVar.y0, d2eVar.z0));
        }
        ilc ilcVar = n4eVar.a;
        ilcVar.b();
        ilcVar.c();
        try {
            n4eVar.b.B(arrayList);
            ilcVar.r();
        } finally {
            ilcVar.l();
        }
    }

    public void V(tpa tpaVar) {
        ((ci9) this.b).i(tpaVar);
        boolean z = tpaVar instanceof oma;
        dcd dcdVar = (dcd) this.c;
        if (z) {
            dcdVar.j((oma) tpaVar);
        } else if (tpaVar instanceof mma) {
            dcdVar.k(((mma) tpaVar).c);
        }
    }

    public void W(MotionEvent motionEvent) {
        ArrayList arrayList = (ArrayList) this.c;
        arrayList.add(new zq4(motionEvent.getX(), motionEvent.getY()));
        int size = arrayList.size();
        xq4 xq4Var = (xq4) this.b;
        if (size == 2) {
            float f = ((zq4) arrayList.get(0)).a;
            float f2 = ((zq4) arrayList.get(0)).b;
            float f3 = ((zq4) arrayList.get(1)).a;
            float f4 = ((zq4) arrayList.get(1)).b;
            xq4Var.a.add(new yq4(1, new float[]{f, f2, f3, f4}));
            Path path = xq4Var.b;
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
        }
        if (arrayList.size() > 3) {
            zq4[] zq4VarArrJ = J((zq4) arrayList.get(0), (zq4) arrayList.get(1), (zq4) arrayList.get(2));
            zq4[] zq4VarArrJ2 = J((zq4) arrayList.get(1), (zq4) arrayList.get(2), (zq4) arrayList.get(3));
            float f5 = ((zq4) arrayList.get(1)).a;
            float f6 = ((zq4) arrayList.get(1)).b;
            zq4 zq4Var = zq4VarArrJ[1];
            float f7 = zq4Var.a;
            zq4 zq4Var2 = zq4VarArrJ2[0];
            float f8 = zq4Var2.a;
            float f9 = ((zq4) arrayList.get(2)).a;
            float f10 = ((zq4) arrayList.get(2)).b;
            float f11 = zq4Var.b;
            float f12 = zq4Var2.b;
            xq4Var.a.add(new yq4(2, new float[]{f5, f6, f7, f11, f8, f12, f9, f10}));
            Path path2 = xq4Var.b;
            path2.moveTo(f5, f6);
            path2.cubicTo(f7, f11, f8, f12, f9, f10);
            arrayList.remove(0);
        }
    }

    public void X(Exception exc, boolean z) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        zw6 zw6VarJ = zw6.j(hashSet);
        hashSet.clear();
        ls5 ls5VarL = zw6VarJ.listIterator(0);
        while (ls5VarL.hasNext()) {
            x94 x94Var = (x94) ls5VarL.next();
            x94Var.getClass();
            x94Var.j(exc, z ? 1 : 3);
        }
    }

    public ukg Y(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.b;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return F(context, intent, z2);
        }
        u24 u24Var = new u24(context, 4, intent);
        cs csVar = (cs) this.c;
        return j1e.g(u24Var, csVar).k(csVar, new xd5(context, intent, z2, 0));
    }

    public void Z(x94 x94Var) {
        ((HashSet) this.b).add(x94Var);
        if (((x94) this.c) != null) {
            return;
        }
        this.c = x94Var;
        r65 r65VarMo2d = x94Var.b.mo2d();
        x94Var.y = r65VarMo2d;
        t94 t94Var = x94Var.s;
        int i = oaf.a;
        r65VarMo2d.getClass();
        t94Var.getClass();
        t94Var.obtainMessage(1, new v94(yn7.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), r65VarMo2d)).sendToTarget();
    }

    @Override // defpackage.a76
    public void a(Object obj) {
        switch (this.a) {
            case LangUtils.HASH_SEED /* 17 */:
                ((b15) this.c).k.n.remove((e05) this.b);
                break;
            default:
                ((erd) this.b).a(obj);
                break;
        }
    }

    public xy a0() throws IOException {
        File file = (File) this.b;
        if (file.exists()) {
            File file2 = (File) this.c;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                z04.c0("Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new xy(file, 1);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e);
            }
            try {
                return new xy(file, 1);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file, e2);
            }
        }
    }

    @Override // defpackage.ab3
    public void b() {
        ((ab3) this.c).b();
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public void c(zl4 zl4Var) {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                dm4.c((AtomicReference) this.b, zl4Var);
                break;
            default:
                dm4.e((AtomicReference) this.c, zl4Var);
                break;
        }
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        b15 b15Var = (b15) this.c;
        b15Var.k.n.remove((e05) this.b);
        boolean z = th instanceof MediaCodec.CodecException;
        d15 d15Var = b15Var.k;
        if (!z) {
            d15Var.b(0, th.getMessage(), th);
            return;
        }
        MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
        d15Var.getClass();
        d15Var.b(1, codecException.getMessage(), codecException);
    }

    @Override // defpackage.ik8
    public void e(int i, yj8 yj8Var, yn7 yn7Var, pc8 pc8Var, IOException iOException, boolean z) {
        Pair pairR = R(i, yj8Var);
        if (pairR != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new dk8(this, pairR, yn7Var, pc8Var, iOException, z, 2));
        }
    }

    @Override // defpackage.dn6
    public ypa f() {
        return new ph4(((dn6) this.b).f(), (List) this.c);
    }

    @Override // defpackage.tge
    public int h() {
        return ((FrameLayout) this.c).getMeasuredHeight();
    }

    @Override // defpackage.i7
    public boolean i(j7 j7Var, MenuItem menuItem) {
        return ((i7) this.b).i(j7Var, menuItem);
    }

    @Override // defpackage.vaf
    public int j(Object obj) {
        iy3 iy3Var = (iy3) obj;
        if (((nw7) this.c).s0) {
            return iy3Var.f;
        }
        return ((vaf) this.b).j(iy3Var.b.e0());
    }

    @Override // defpackage.tge
    public int k() {
        return ((FrameLayout) this.c).getBottom();
    }

    @Override // defpackage.i7
    public void l(j7 j7Var) {
        ((i7) this.b).l(j7Var);
        dn dnVar = (dn) this.c;
        if (dnVar.H0 != null) {
            dnVar.w0.getDecorView().removeCallbacks(dnVar.I0);
        }
        if (dnVar.G0 != null) {
            vof vofVar = dnVar.J0;
            if (vofVar != null) {
                vofVar.b();
            }
            vof vofVarA = zmf.a(dnVar.G0);
            vofVarA.a(0.0f);
            dnVar.J0 = vofVarA;
            vofVarA.d(new tm(2, this));
        }
        dnVar.F0 = null;
        ViewGroup viewGroup = dnVar.L0;
        WeakHashMap weakHashMap = zmf.a;
        mmf.c(viewGroup);
        dnVar.G();
    }

    @Override // defpackage.tge
    public void m() {
        CallWaitingRoomEventsWidget.p0((CallWaitingRoomEventsWidget) this.b);
    }

    @Override // defpackage.i7
    public boolean o(j7 j7Var, wq8 wq8Var) {
        return ((i7) this.b).o(j7Var, wq8Var);
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onBufferedAmountChange(long j) {
        e24 e24Var = (e24) this.c;
        Iterator it = e24Var.e.iterator();
        while (it.hasNext()) {
            z26 z26Var = (z26) it.next();
            try {
                if (e24Var == z26Var.b) {
                    z26.b(z26Var.g);
                }
            } catch (Throwable th) {
                e24Var.b.reportException("DataChannelRtcTransport", "rtc.datachannel.buffer.listen", new RtcInternalHandleException(th));
            }
        }
    }

    @Override // defpackage.tge
    public void onDismiss() {
        CallWaitingRoomEventsWidget.p0((CallWaitingRoomEventsWidget) this.b);
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public void onError(Throwable th) {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((ab3) this.c).onError(th);
                break;
            default:
                ((erd) this.b).onError(th);
                break;
        }
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onMessage(DataChannel.Buffer buffer) {
        ByteBuffer byteBuffer = buffer.data;
        byte[] bArr = new byte[byteBuffer.remaining()];
        int i = buffer.binary ? 2 : 1;
        byteBuffer.get(bArr);
        e24 e24Var = (e24) this.c;
        Iterator it = e24Var.d.iterator();
        while (it.hasNext()) {
            try {
                ((uoc) it.next()).a(e24Var, bArr, i);
            } catch (Throwable th) {
                e24Var.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.response", new RtcInternalHandleException(th));
            }
        }
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onStateChange() {
        boolean z = ((DataChannel) this.b).state() == DataChannel.State.OPEN;
        e24 e24Var = (e24) this.c;
        Iterator it = e24Var.c.iterator();
        while (it.hasNext()) {
            try {
                ((toc) it.next()).a(e24Var, z);
            } catch (Throwable th) {
                e24Var.b.reportException("DataChannelRtcTransport", "rtc.datachannel.handle.connection", new RtcInternalHandleException(th));
            }
        }
    }

    @Override // defpackage.bha
    public void p() {
        mr0.I((cla) this.c);
        gy2.c.P1().d();
    }

    @Override // defpackage.tge
    public View q() {
        return (FrameLayout) this.c;
    }

    @Override // defpackage.ik8
    public void r(int i, yj8 yj8Var, yn7 yn7Var, pc8 pc8Var) {
        Pair pairR = R(i, yj8Var);
        if (pairR != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new pk8(this, pairR, yn7Var, pc8Var, 0));
        }
    }

    @Override // defpackage.nr4
    public void s(int i, yj8 yj8Var, Exception exc) {
        Pair pairR = R(i, yj8Var);
        if (pairR != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new v05(this, pairR, exc, 19));
        }
    }

    @Override // defpackage.ik8
    public void t(int i, yj8 yj8Var, yn7 yn7Var, pc8 pc8Var) {
        Pair pairR = R(i, yj8Var);
        if (pairR != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new pk8(this, pairR, yn7Var, pc8Var, 2));
        }
    }

    @Override // defpackage.ao0
    public bm7 u(Uri uri) {
        Uri uri2;
        jo7 jo7Var = (jo7) this.c;
        if (jo7Var != null && (uri2 = (Uri) jo7Var.b) != null && uri2.equals(uri)) {
            bm7 bm7Var = (bm7) ((jo7) this.c).c;
            fm9.l(bm7Var);
            return bm7Var;
        }
        bm7 bm7VarU = ((ao0) this.b).u(uri);
        jo7 jo7Var2 = new jo7();
        jo7Var2.a = null;
        jo7Var2.b = uri;
        jo7Var2.c = bm7VarU;
        this.c = jo7Var2;
        return bm7VarU;
    }

    @Override // defpackage.nr4
    public void w(int i, yj8 yj8Var, int i2) {
        Pair pairR = R(i, yj8Var);
        if (pairR != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new si1(this, pairR, i2, 14));
        }
    }

    @Override // defpackage.ik8
    public void x(int i, yj8 yj8Var, yn7 yn7Var, pc8 pc8Var) {
        Pair pairR = R(i, yj8Var);
        if (pairR != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new pk8(this, pairR, yn7Var, pc8Var, 1));
        }
    }

    @Override // defpackage.tge
    public int y() {
        return 0;
    }

    @Override // defpackage.nr4
    public void z(int i, yj8 yj8Var) {
        Pair pairR = R(i, yj8Var);
        if (pairR != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new ok8(this, pairR, 0));
        }
    }

    public /* synthetic */ imc(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public imc(jlc jlcVar) {
        this.a = 0;
        this.b = jlcVar;
        this.c = new khe(new lwa(19, this));
    }

    public imc(xq4 xq4Var) {
        this.a = 16;
        this.c = new ArrayList();
        this.b = xq4Var;
    }

    public imc(ux1 ux1Var) {
        this.a = 10;
        this.b = ux1Var;
        ci9 ci9Var = new ci9();
        this.c = ci9Var;
        ci9Var.i(new u90(5, null));
    }

    public imc(v24 v24Var) {
        this.a = 6;
        this.b = v24Var;
    }

    public imc(tf9 tf9Var, ey1 ey1Var, p99 p99Var) {
        this.a = 26;
        m5d m5dVar = new m5d(ey1Var, p99Var, new qc3());
        this.b = tf9Var;
        this.c = m5dVar;
    }

    public imc(File file) {
        this.a = 4;
        this.b = file;
        this.c = new File(file.getPath() + ".bak");
    }

    public imc(Context context, int i) {
        this.a = i;
        switch (i) {
            case 29:
                this.b = context;
                this.c = new khe(new zj7(28, this));
                break;
            default:
                this.b = context;
                this.c = new cs(2);
                break;
        }
    }

    public imc(int i) {
        this.a = i;
        switch (i) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                this.b = new HashSet();
                break;
            case 19:
                break;
            case 21:
                this.b = new HashMap();
                break;
            case 28:
                this.b = new ci9();
                this.c = new dcd();
                V(pma.R);
                break;
            default:
                this.b = new HashMap();
                this.c = new ArrayList();
                break;
        }
    }

    public imc(fn0 fn0Var) {
        this.a = 5;
        this.c = fn0Var;
    }

    public imc(tm5 tm5Var, SparseArray sparseArray) {
        this.a = 2;
        this.b = tm5Var;
        SparseBooleanArray sparseBooleanArray = tm5Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iB = tm5Var.b(i);
            fd fdVar = (fd) sparseArray.get(iB);
            fdVar.getClass();
            sparseArray2.append(iB, fdVar);
        }
        this.c = sparseArray2;
    }

    public imc(fu1 fu1Var) {
        this.a = 9;
        this.c = fu1Var;
        this.b = null;
    }
}
