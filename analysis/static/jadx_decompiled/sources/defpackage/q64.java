package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.android.exoplayer2.PlaybackException;
import java.util.List;
import javax.inject.Provider;
import one.me.folders.edit.FolderEditScreen;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.sdk.utils.cancelable.Cancelable;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class q64 implements lm7, jm7, qj3, ve4, wff, Cancelable, b66, cw7, Provider, Uploader.IdleStateProvider, km7, yy, jm0, km0, mq1, o1d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q64(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yy
    public void a(String str, Throwable th) {
        hm9.p(((e3) ((ki5) this.b).b.a).e, str, th);
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        mpb mpbVar = (mpb) obj;
        bd4 bd4Var = (bd4) this.b;
        bd4Var.getClass();
        hm9.m("bd4", "success connect to host: %s", mpbVar.f.toString());
        bd4Var.l(mpbVar);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 9:
                return new gx4(((gx4) this.b).b, (List) obj);
            default:
                return ((tx4) this.b).e((CharSequence) obj);
        }
    }

    @Override // defpackage.jm0, defpackage.km0
    public long b(long j) {
        switch (this.a) {
            case 26:
                return maf.k((j * r8.f) / 1000000, 0L, ((qm5) this.b).k - 1);
            default:
                return oaf.k((j * r8.f) / 1000000, 0L, ((qm5) this.b).k - 1);
        }
    }

    @Override // defpackage.wff
    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        m1f m1fVar = (m1f) ((o9g) this.b).b;
        m1fVar.getClass();
        m1fVar.Y.execute(new vs5(m1fVar, 28, videoFrameProcessingException));
    }

    @Override // ru.ok.android.externcalls.sdk.utils.cancelable.Cancelable
    public void cancel() {
        ((zl4) this.b).g();
    }

    @Override // defpackage.cw7
    public void d() {
        OneMeDraweeView oneMeDraweeView = ((ky4) this.b).G0;
        if (oneMeDraweeView != null) {
            oneMeDraweeView.setVisibility(8);
        }
    }

    @Override // defpackage.lm7
    public void e(Object obj, sm5 sm5Var) {
        u65 u65Var = (u65) obj;
        SparseArray sparseArray = ((h74) this.b).X;
        SparseBooleanArray sparseBooleanArray = sm5Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iA = sm5Var.a(i);
            ed edVar = (ed) sparseArray.get(iA);
            edVar.getClass();
            sparseArray2.append(iA, edVar);
        }
        u65Var.getClass();
    }

    @Override // javax.inject.Provider
    public Object get() {
        return ((Uploader) this.b).getSink();
    }

    @Override // defpackage.o1d
    public int i(int i) {
        int iL = ((ol7) ((FolderEditScreen) this.b).X.C(i)).getI0();
        if ((536870911 & iL) == 8) {
            return 0;
        }
        if ((536870912 & iL) != 0) {
            return 1;
        }
        if ((1073741824 & iL) != 0) {
            return 2;
        }
        return (iL & Integer.MIN_VALUE) != 0 ? 3 : 4;
    }

    @Override // defpackage.jm7, defpackage.km7
    public void invoke(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 1:
                ((u65) obj).getClass();
                hm9.p("u65", "onPlayerError", (PlaybackException) obj2);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((m3b) obj).q((fd8) obj2);
                break;
            case 16:
                ((n3b) obj).S((zz3) obj2);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                ((m3b) obj).q(((n75) obj2).a.V0);
                break;
            case 18:
                ((n3b) obj).b0(((o75) obj2).a.Y0);
                break;
            case 19:
                ((m3b) obj).s((e99) obj2);
                break;
            case 20:
                ((n3b) obj).s0((f99) obj2);
                break;
            case 21:
                ((m3b) obj).o((si4) obj2);
                break;
            case 22:
                ((n3b) obj).v((jlf) obj2);
                break;
            default:
                dd3 dd3Var = (dd3) ((x99) obj2).a;
                ((ol8) obj).getClass();
                tb8 tb8Var = ((lv4) ((mv4) dd3Var.a.get(0)).a.get(0)).a;
                break;
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader.IdleStateProvider
    public boolean isIdle() {
        return ((EventQueueCollector.IdleStateProvider) this.b).isIdle();
    }

    @Override // defpackage.ve4
    public ffc k(int i, rze rzeVar, int[] iArr) {
        ww6 ww6VarI = zw6.i();
        for (int i2 = 0; i2 < rzeVar.a; i2++) {
            int i3 = i2;
            ww6VarI.a(new je4(i, rzeVar, i3, (oe4) this.b, iArr[i2]));
        }
        return ww6VarI.j();
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        xs5 xs5Var = (xs5) this.b;
        xs5Var.getClass();
        xs5Var.b.execute(new vs5(xs5Var, 0, lq1Var));
        return "triggerAePrecapture";
    }

    public /* synthetic */ q64(ed edVar, PlaybackException playbackException) {
        this.a = 1;
        this.b = playbackException;
    }

    public /* synthetic */ q64(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
    }
}
