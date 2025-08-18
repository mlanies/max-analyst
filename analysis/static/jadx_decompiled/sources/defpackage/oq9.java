package defpackage;

import android.os.Parcel;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class oq9 implements s43, zl6, cc3, dze, bha, Provider, poa, im9, hlf, ofc {
    public static oq9 b;
    public final /* synthetic */ int a;
    public static final oq9 c = new oq9(1);
    public static final int[] o = {8, 13, 11, 2, 0, 1, 7};
    public static final oq9 X = new oq9(3);
    public static final oq9 Y = new oq9(4);
    public static final oq9 Z = new oq9(5);

    public /* synthetic */ oq9(int i) {
        this.a = i;
    }

    public static final qg6 d() {
        int i = rg6.o;
        qg6 qg6Var = new qg6();
        qg6Var.a = 0;
        qg6Var.b = 0;
        qg6Var.c = 0.0f;
        qg6Var.d = 0;
        qg6Var.e = false;
        qg6Var.f = 1;
        return qg6Var;
    }

    public static void e(ArrayList arrayList, int i) {
        if (s5c.H(i, 0, 7, o) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public static dpd h(ji9 ji9Var) {
        cpd cpdVar = new cpd();
        cpdVar.a = ji9Var.f;
        cpdVar.c = ji9Var.b;
        cpdVar.d = ji9Var.c;
        cpdVar.b = ji9Var.e;
        cpdVar.e = ji9Var.g;
        cpdVar.f = ji9Var.d;
        return new dpd(cpdVar);
    }

    public static aw0 i(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (z04.a(str.charAt(i2 + 1)) + (z04.a(str.charAt(i2)) << 4));
        }
        return new aw0(bArr);
    }

    public static aw0 j(String str) {
        aw0 aw0Var = new aw0(str.getBytes(a52.a));
        aw0Var.b = str;
        return aw0Var;
    }

    public static aw0 k(byte[] bArr) {
        int length = bArr.length;
        hm9.g(bArr.length, 0, length);
        return new aw0(ys.Z(0, bArr, length));
    }

    @Override // defpackage.hlf
    public void E(VideoSink$VideoSinkException videoSink$VideoSinkException) {
    }

    @Override // defpackage.hlf
    public void M() {
    }

    @Override // defpackage.poa
    public double a(double d, double d2, double d3, boolean z) {
        return 1.0d;
    }

    @Override // defpackage.ofc
    public void accept(Object obj, Object obj2) {
        dig digVar = (dig) ((vgg) obj).o();
        djg djgVar = new djg((qne) obj2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = igg.a;
        parcelObtain.writeInt(1);
        ay7.W(parcelObtain, ay7.T(parcelObtain, 20293));
        parcelObtain.writeStrongBinder(djgVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            digVar.c.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // defpackage.im9
    public boolean b(String str) {
        System.loadLibrary(str);
        return true;
    }

    @Override // defpackage.poa
    public void c(double d) {
    }

    @Override // defpackage.cc3
    public Object f(bg4 bg4Var) {
        return nd7.s((Executor) bg4Var.f(new lqb(ip0.class, Executor.class)));
    }

    @Override // defpackage.bha
    public void g() {
        gy2.c.P1().b(":chats-search", null);
    }

    @Override // javax.inject.Provider
    public /* bridge */ /* synthetic */ Object get() {
        return "com.google.android.datatransport.events";
    }

    @Override // defpackage.hlf
    public void onFirstFrameRendered() {
    }

    @Override // defpackage.poa
    public void reset() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x016e, code lost:
    
        if (r9 != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0170, code lost:
    
        r9 = 5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0376 A[EXC_TOP_SPLITTER, PHI: r15
      0x0376: PHI (r15v6 int) = (r15v4 int), (r15v7 int), (r15v9 int) binds: [B:248:0x0374, B:230:0x0331, B:206:0x02dc] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.util.Set] */
    @Override // defpackage.s43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.gle w(defpackage.gy8 r23) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq9.w(gy8):gle");
    }
}
