package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.RemoteException;
import android.util.Pair;
import android.widget.Toast;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.folders.list.FoldersListScreen;
import org.webrtc.EncodedImage;
import org.webrtc.JniCommon;
import org.webrtc.Size;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class si1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ si1(aw5 aw5Var, int i, int i2, ArrayList arrayList) {
        this.a = 9;
        this.c = aw5Var;
        this.b = i2;
        this.o = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sad sadVar;
        int i = this.b;
        Object obj = this.o;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                jec jecVar = (jec) obj2;
                if (jecVar.a) {
                    CallScreen.m0((CallScreen) obj, i, "submitList");
                    jecVar.a = false;
                    break;
                }
                break;
            case 1:
                ((iv1) obj2).c(i, (dp3) obj);
                break;
            case 2:
                ((iv1) obj2).b(i, (pv1) obj);
                break;
            case 3:
                Object obj3 = ((o9g) obj).b;
                wb3 wb3Var = (wb3) obj2;
                String str = (String) wb3Var.a.get(Integer.valueOf(i));
                if (str != null) {
                    g8 g8Var = (g8) wb3Var.e.get(str);
                    if ((g8Var != null ? g8Var.a : null) != null) {
                        e8 e8Var = g8Var.a;
                        if (wb3Var.d.remove(str)) {
                            e8Var.x(obj3);
                            break;
                        }
                    } else {
                        wb3Var.g.remove(str);
                        wb3Var.f.put(str, obj3);
                        break;
                    }
                }
                break;
            case 4:
                ((wb3) obj2).a(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 5:
                t54 t54Var = (t54) obj2;
                t54Var.u0.decrementAndGet();
                ByteBuffer byteBuffer = ((EncodedImage) obj).buffer;
                if (i > t54Var.w0.get()) {
                    t54Var.a.decode(byteBuffer);
                }
                vbg vbgVar = t54Var.z0;
                vbgVar.y.decrementAndGet();
                byteBuffer.rewind();
                vbgVar.z.addAndGet(-byteBuffer.capacity());
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                break;
            case 6:
                ((ihb) ((xu3) obj2).c).f(i, (Serializable) obj);
                break;
            case 7:
                lr4 lr4Var = (lr4) obj2;
                lr4Var.getClass();
                nr4 nr4Var = (nr4) obj;
                nr4Var.getClass();
                nr4Var.w(lr4Var.a, lr4Var.b, i);
                break;
            case 8:
                kr4 kr4Var = (kr4) obj2;
                kr4Var.getClass();
                mr4 mr4Var = (mr4) obj;
                mr4Var.getClass();
                mr4Var.y(kr4Var.a, kr4Var.b, i);
                break;
            case 9:
                iw5 iw5VarM0 = ((FoldersListScreen) ((aw5) obj2).Z.b).m0();
                iw5VarM0.getClass();
                at5 at5Var = ((w9f) ((List) obj).get(i)).a;
                iw5VarM0.s0 = at5Var != null ? at5Var.a : null;
                break;
            case 10:
                ((h26) obj2).b((Size) obj, i + 1);
                break;
            case 11:
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    nm7 nm7Var = (nm7) it.next();
                    if (i != -1) {
                        nm7Var.b.a(i);
                    }
                    nm7Var.c = true;
                    ((jm7) obj).invoke(nm7Var.a);
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Iterator it2 = ((CopyOnWriteArraySet) obj2).iterator();
                while (it2.hasNext()) {
                    om7 om7Var = (om7) it2.next();
                    if (!om7Var.d) {
                        if (i != -1) {
                            om7Var.b.a(i);
                        }
                        om7Var.c = true;
                        ((km7) obj).invoke(om7Var.a);
                    }
                }
                break;
            case 13:
                bm7 bm7Var = (bm7) obj;
                w98 w98Var = (w98) obj2;
                w98Var.getClass();
                try {
                    sadVar = (sad) bm7Var.get();
                    fm9.i(sadVar, "SessionResult must not be null");
                } catch (InterruptedException | ExecutionException e) {
                    z04.d0("Session operation failed", e);
                    sadVar = new sad(-1);
                } catch (CancellationException e2) {
                    z04.d0("Session operation cancelled", e2);
                    sadVar = new sad(1);
                }
                qr6 qr6Var = w98Var.w;
                if (qr6Var != null) {
                    try {
                        qr6Var.a(w98Var.c, i, sadVar.b());
                        break;
                    } catch (RemoteException unused) {
                        z04.c0("Error in sending");
                        return;
                    }
                }
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                Pair pair = (Pair) obj;
                ((i74) ((vk8) ((imc) obj2).c).j).w(((Integer) pair.first).intValue(), (yj8) pair.second, i);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                byte[] bArr = (byte[]) obj;
                qp4 qp4Var = (qp4) obj2;
                Iterator it3 = ((CopyOnWriteArrayList) qp4Var.a).iterator();
                while (it3.hasNext()) {
                    try {
                        ((poc) it3.next()).a(i, bArr);
                    } catch (Throwable th) {
                        ((a4c) qp4Var.c).reportException("RtcNotificationReceiver", "rtc.notification.handle.datareceived", th);
                    }
                }
                break;
            default:
                try {
                    Toast.makeText((Context) obj2, (String) obj, i).show();
                    break;
                } catch (Exception e3) {
                    hm9.n("a14", "onError failed: " + e3.getMessage());
                }
        }
    }

    public /* synthetic */ si1(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = obj2;
    }

    public /* synthetic */ si1(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
    }
}
