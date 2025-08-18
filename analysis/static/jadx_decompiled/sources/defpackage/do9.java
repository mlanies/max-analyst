package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Looper;
import android.os.Process;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.camera.core.ImageCaptureException;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import one.me.android.media.service.OneMeDownloadService;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.RLottieDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.AudioTrack;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes.dex */
public final /* synthetic */ class do9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ do9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i;
        int i2 = 1;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                go9 go9Var = (go9) this.b;
                synchronized (go9Var.c) {
                    i = go9Var.b;
                }
                ((f84) this.c).a(i);
                return;
            case 1:
                ((g84) this.c).a(((ho9) this.b).i());
                return;
            case 2:
                taa taaVar = (taa) this.b;
                vo4 vo4Var = (vo4) this.c;
                try {
                    Context context = taaVar.a;
                    HashMap map = xo4.t0;
                    context.startService(new Intent(context, (Class<?>) OneMeDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD").putExtra("foreground", false).putExtra("download_request", vo4Var).putExtra("stop_reason", 0));
                    return;
                } catch (Throwable th) {
                    hm9.p("OneMeDownloadController", "fail to sendAddDownload", th);
                    return;
                }
            case 3:
                ((InputMethodManager) ((lea) this.b).getContext().getSystemService("input_method")).showSoftInput((EditText) this.c, 1);
                return;
            case 4:
                i50 i50Var = (i50) this.b;
                ViewGroup viewGroup = (ViewGroup) ((WeakReference) i50Var.c).get();
                if (viewGroup != null) {
                    viewGroup.removeView((uge) i50Var.X);
                }
                i50Var.X = null;
                i50Var.Y = null;
                pla plaVar = (pla) ((mec) this.c).a;
                if (plaVar != null) {
                    plaVar.b();
                    return;
                }
                return;
            case 5:
                nsa nsaVar = (nsa) this.b;
                PeerConnection.SignalingState signalingState = (PeerConnection.SignalingState) this.c;
                nsaVar.getClass();
                nsaVar.l1 = signalingState == PeerConnection.SignalingState.HAVE_REMOTE_OFFER || signalingState == PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER || signalingState == PeerConnection.SignalingState.STABLE;
                z = signalingState == PeerConnection.SignalingState.STABLE;
                nsaVar.m1 = z;
                if (z) {
                    nsaVar.i("maybeUpdateSenders", new bdg(nsaVar, i2));
                }
                msa msaVar = nsaVar.Z0;
                if (msaVar != null) {
                    msaVar.k(nsaVar, signalingState);
                    return;
                }
                return;
            case 6:
                nsa nsaVar2 = (nsa) this.b;
                nsaVar2.getClass();
                PeerConnection.IceConnectionState iceConnectionState = PeerConnection.IceConnectionState.CONNECTED;
                PeerConnection.IceConnectionState iceConnectionState2 = (PeerConnection.IceConnectionState) this.c;
                if (iceConnectionState2 == iceConnectionState) {
                    nsaVar2.i("maybeUpdateSenders", new bdg(nsaVar2, z ? 1 : 0));
                }
                msa msaVar2 = nsaVar2.Z0;
                if (msaVar2 != null) {
                    msaVar2.n(nsaVar2, iceConnectionState2);
                    return;
                }
                return;
            case 7:
                nsa nsaVar3 = (nsa) this.b;
                if (nsaVar3.Z0 != null) {
                    Iterator<AudioTrack> it = ((MediaStream[]) this.c)[0].audioTracks.iterator();
                    while (it.hasNext()) {
                        nsaVar3.Z0.e(it.next().id());
                    }
                    return;
                }
                return;
            case 8:
                nsa nsaVar4 = (nsa) this.b;
                msa msaVar3 = nsaVar4.Z0;
                if (msaVar3 != null) {
                    msaVar3.l(nsaVar4, (IceCandidate) this.c);
                    return;
                }
                return;
            case 9:
                nsa nsaVar5 = (nsa) this.b;
                msa msaVar4 = nsaVar5.Z0;
                if (msaVar4 != null) {
                    msaVar4.h(nsaVar5, (IceCandidate[]) this.c);
                    return;
                }
                return;
            case 10:
                nsa nsaVar6 = (nsa) this.b;
                List list = (List) this.c;
                nsaVar6.getClass();
                try {
                    if (nsaVar6.V0 == null) {
                        nsaVar6.d1 = list;
                        nsaVar6.t();
                        nsaVar6.z();
                        nsaVar6.C0.post(new csa(nsaVar6, 0));
                        return;
                    }
                    nsaVar6.K0.log("PCRTCClient", nsaVar6.toString() + ": peer connection is already created");
                    return;
                } catch (Exception e) {
                    nsaVar6.W0 = true;
                    nsaVar6.K0.reportException("PCRTCClient", "pc.create", e);
                    throw e;
                }
            case 11:
                dhe dheVar = (dhe) this.c;
                lva lvaVar = (lva) this.b;
                lvaVar.getClass();
                try {
                    lvaVar.b(dheVar.b, dheVar.c, dheVar.o);
                    return;
                } catch (Exception e2) {
                    hm9.p("lva", "onSyncSuccess: exception", e2);
                    ((cba) lvaVar.h).c(new HandledException(e2), true);
                    return;
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((j7b) this.b).b((RecyclerView) this.c, 0, 0);
                return;
            case 13:
                try {
                    ((u7b) this.b).g((gi9) this.c);
                    return;
                } catch (Throwable th2) {
                    hm9.p("u7b", "updatePresence failure!", th2);
                    return;
                }
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                h8b h8bVar = (h8b) this.b;
                iee ieeVar = h8bVar.t;
                kq0.e();
                if (((ax1) this.c) == h8bVar.c()) {
                    ieeVar.e();
                    return;
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((g8b) this.b).a((see) this.c);
                return;
            case 16:
                ((q8b) ((sy4) this.b).b).C0.a((see) this.c);
                return;
            case LangUtils.HASH_SEED /* 17 */:
                try {
                    ((cm9) this.b).getClass();
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
                ((Runnable) this.c).run();
                return;
            case 18:
                yhc yhcVar = ((x9b) this.b).f;
                yhcVar.getClass();
                kq0.e();
                boolean z3 = yhcVar.g;
                ov6 ov6Var = (ov6) this.c;
                if (z3) {
                    ov6Var.close();
                    return;
                }
                c54.p("onImageCaptured() must be called before onFinalResult()", yhcVar.c.b.isDone());
                yhcVar.a();
                fc0 fc0Var = yhcVar.a;
                fc0Var.getClass();
                fc0Var.b.execute(new flc(fc0Var, 27, ov6Var));
                return;
            case 19:
                yhc yhcVar2 = ((x9b) this.b).f;
                yhcVar2.getClass();
                kq0.e();
                if (yhcVar2.g) {
                    return;
                }
                fc0 fc0Var2 = yhcVar2.a;
                fc0Var2.getClass();
                fc0Var2.b.execute(new wje(fc0Var2, (Bitmap) this.c));
                return;
            case 20:
                yhc yhcVar3 = ((x9b) this.b).f;
                yhcVar3.getClass();
                kq0.e();
                if (yhcVar3.g) {
                    return;
                }
                c54.p("onImageCaptured() must be called before onFinalResult()", yhcVar3.c.b.isDone());
                yhcVar3.a();
                kq0.e();
                fc0 fc0Var3 = yhcVar3.a;
                fc0Var3.getClass();
                fc0Var3.b.execute(new flc(fc0Var3, 26, (ImageCaptureException) this.c));
                return;
            case 21:
                ((ProfileInstallerInitializer) this.b).getClass();
                khb.a(Looper.getMainLooper()).postDelayed(new nm((Context) this.c, 4), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 22:
                unb unbVar = (unb) this.b;
                ts6 ts6Var = unbVar.C0;
                u1d u1dVar = (u1d) this.c;
                unbVar.J0 = ts6Var == null ? u1dVar : new pm5(-9223372036854775807L);
                unbVar.K0 = u1dVar.f();
                if (unbVar.Q0 == -1 && u1dVar.f() == -9223372036854775807L) {
                    z2 = true;
                }
                unbVar.L0 = z2;
                unbVar.M0 = z2 ? 7 : 1;
                unbVar.Z.q(unbVar.K0, u1dVar.c(), unbVar.L0);
                if (unbVar.G0) {
                    return;
                }
                unbVar.i();
                return;
            case 23:
                vnb vnbVar = (vnb) this.b;
                us6 us6Var = vnbVar.D0;
                v1d v1dVar = (v1d) this.c;
                vnbVar.L0 = us6Var == null ? v1dVar : new wd0(-9223372036854775807L);
                vnbVar.M0 = v1dVar.f();
                if (!vnbVar.S0 && v1dVar.f() == -9223372036854775807L) {
                    z = true;
                }
                vnbVar.N0 = z;
                vnbVar.O0 = z ? 7 : 1;
                if (vnbVar.H0) {
                    vnbVar.Z.v(vnbVar.M0, v1dVar.c(), vnbVar.N0);
                    return;
                } else {
                    vnbVar.u();
                    return;
                }
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                Gson gson = RLottieDrawable.gson;
                RLottieDrawable rLottieDrawable = (RLottieDrawable) this.b;
                rLottieDrawable.getClass();
                Iterator it2 = new ArrayList(rLottieDrawable.E1).iterator();
                while (it2.hasNext()) {
                    ((RLottieDrawable.DrawableLoadListener) it2.next()).onError((Throwable) this.c);
                }
                return;
            case 25:
                p9c p9cVar = (p9c) this.b;
                p9cVar.getClass();
                new c0a(qy9.j((List) this.c), new n9c(p9cVar, z ? 1 : 0)).a();
                return;
            case 26:
                ((RecordManagerImpl) this.b).applyRecordStarted((oh1) this.c);
                return;
            case 27:
                ((Executor) this.b).execute((Runnable) this.c);
                return;
            case 28:
                ((nb0) this.b).u0.accept((xkf) this.c);
                return;
            default:
                ((tu0) this.b).x((Typeface) this.c);
                return;
        }
    }
}
