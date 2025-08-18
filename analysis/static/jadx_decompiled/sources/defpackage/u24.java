package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.BitmapFactory;
import android.media.AudioRecord;
import android.net.Uri;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.apache.http.HttpStatus;
import org.webrtc.EglBase;
import org.webrtc.EglThread;
import org.webrtc.audio.WebRtcAudioRecord;

/* loaded from: classes.dex */
public final /* synthetic */ class u24 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u24(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i = -1;
        int i2 = 0;
        String str2 = null;
        switch (this.a) {
            case 0:
                v24 v24Var = (v24) this.b;
                v24Var.getClass();
                byte[] bArr = (byte[]) this.c;
                return c54.q(bArr, bArr.length, v24Var.c);
            case 1:
                Uri uri = (Uri) this.c;
                v24 v24Var2 = (v24) this.b;
                t24 t24VarA = v24Var2.b.a();
                BitmapFactory.Options options = v24Var2.c;
                try {
                    t24VarA.G(new a34(uri, 0L, -1L));
                    byte[] bArrCopyOf = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                    int i3 = 0;
                    while (i2 != -1) {
                        if (i3 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                        }
                        i2 = t24VarA.read(bArrCopyOf, i3, bArrCopyOf.length - i3);
                        if (i2 != -1) {
                            i3 += i2;
                        }
                    }
                    byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i3);
                    return c54.q(bArrCopyOf2, bArrCopyOf2.length, options);
                } finally {
                    t24VarA.close();
                }
            case 2:
                return EglThread.lambda$create$0((EglBase.Context) this.b, (int[]) this.c);
            case 3:
                return Long.valueOf(((k4a) ((dd5) this.b).a).f(5, (long[]) this.c));
            case 4:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                c8d c8dVarR = c8d.r();
                ((ArrayDeque) c8dVarR.o).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (c8dVarR) {
                    try {
                        String str3 = (String) c8dVarR.a;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null && context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                if (str.startsWith(".")) {
                                    c8dVarR.a = context.getPackageName() + serviceInfo.name;
                                } else {
                                    c8dVarR.a = serviceInfo.name;
                                }
                                str2 = (String) c8dVarR.a;
                            }
                        }
                    } finally {
                    }
                }
                if (str2 != null) {
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if ((c8dVarR.v(context) ? prf.c(context, intent2) : context.startService(intent2)) == null) {
                        i = HttpStatus.SC_NOT_FOUND;
                    }
                } catch (IllegalStateException e) {
                    e.toString();
                    i = HttpStatus.SC_PAYMENT_REQUIRED;
                } catch (SecurityException unused) {
                    i = HttpStatus.SC_UNAUTHORIZED;
                }
                return Integer.valueOf(i);
            case 5:
                yx7 yx7Var = (yx7) this.b;
                yx7Var.getClass();
                long jNanoTime = System.nanoTime();
                List<kzc> listA = ((xzc) yx7Var.t.get()).a((String) this.c);
                gi9 gi9Var = new gi9((Object) null);
                gi9 gi9Var2 = new gi9((Object) null);
                gi9 gi9Var3 = new gi9((Object) null);
                ArrayList arrayList = new ArrayList(listA.size());
                for (kzc kzcVar : listA) {
                    e52 e52Var = kzcVar.o;
                    if (e52Var == null || gi9Var.d(e52Var.a)) {
                        uj3 uj3Var = kzcVar.X;
                        if (uj3Var == null || gi9Var2.d(uj3Var.n())) {
                            fs8 fs8Var = kzcVar.Y;
                            if (fs8Var != null) {
                                long j = fs8Var.a;
                                if (!gi9Var3.d(j)) {
                                    gi9Var3.a(j);
                                    arrayList.add(kzcVar);
                                }
                            }
                            arrayList.add(kzcVar);
                        } else {
                            gi9Var2.a(uj3Var.n());
                            arrayList.add(kzcVar);
                        }
                    } else {
                        gi9Var.a(kzcVar.o.a);
                        arrayList.add(kzcVar);
                    }
                }
                hm9.H("yx7", "localSearchWorker, local search finish: %d ms", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime)));
                return arrayList;
            case 6:
                return ((qpc) this.b).a.a((yk) this.c);
            case 7:
                return Long.valueOf(((eoe) this.b).b((List) this.c));
            case 8:
                return (upe) ((vpe) this.b).a.get((CharSequence) this.c);
            case 9:
                wef wefVar = (wef) this.b;
                wefVar.getClass();
                lef lefVar = (lef) this.c;
                hm9.m("wef", "newConversion: for data = %s", lefVar);
                w36 w36Var = new w36();
                w36Var.o = wefVar.c.a("mp4").getAbsolutePath();
                w36Var.b = lefVar;
                return new kef(w36Var);
            default:
                return ((WebRtcAudioRecord) this.b).lambda$scheduleLogRecordingConfigurationsTask$0((AudioRecord) this.c);
        }
    }
}
