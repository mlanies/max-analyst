package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b;
import com.my.tracker.MyTrackerConfig;
import java.util.Iterator;
import java.util.Map;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.Widget;
import org.apache.http.util.LangUtils;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import org.webrtc.StatsReport;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class yt8 implements qj3, i33, b66, xha, b17, pv6, y2a, lde, MyTrackerConfig.Logger, grd, RTCStatsCollectorCallback, jw5, wu, o1d, hx0, mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yt8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xha
    public void I(yha yhaVar) {
        yha yhaVar2 = yha.X;
        ta3 ta3Var = (ta3) this.b;
        if (yhaVar == yhaVar2) {
            ((ua3) ta3Var).makeCompleting$kotlinx_coroutines_core(Boolean.TRUE);
        } else {
            ((ua3) ta3Var).makeCompleting$kotlinx_coroutines_core(Boolean.FALSE);
        }
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        switch (this.a) {
            case 9:
                dl9 dl9Var = (dl9) this.b;
                ViewGroup viewGroup = dl9Var.Y;
                int iB = x6gVar.b();
                if (viewGroup.getPaddingLeft() != iB) {
                    viewGroup.setPadding(iB, viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
                }
                ViewGroup viewGroup2 = dl9Var.Y;
                int iC = x6gVar.c();
                if (viewGroup2.getPaddingRight() != iC) {
                    viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), iC, viewGroup2.getPaddingBottom());
                    break;
                }
                break;
            default:
                nl9 nl9Var = (nl9) this.b;
                ViewGroup viewGroup3 = nl9Var.z0;
                int iB2 = x6gVar.b();
                if (viewGroup3.getPaddingLeft() != iB2) {
                    viewGroup3.setPadding(iB2, viewGroup3.getPaddingTop(), viewGroup3.getPaddingRight(), viewGroup3.getPaddingBottom());
                }
                ViewGroup viewGroup4 = nl9Var.z0;
                int iC2 = x6gVar.c();
                if (viewGroup4.getPaddingRight() != iC2) {
                    viewGroup4.setPadding(viewGroup4.getPaddingLeft(), viewGroup4.getPaddingTop(), iC2, viewGroup4.getPaddingBottom());
                }
                j47.o(nl9Var.z0, x6gVar.a());
                break;
        }
        return x6gVar;
    }

    @Override // defpackage.hx0
    public void a(long j, long j2, long j3) {
        yo4 yo4Var = ((jnb) this.b).e;
        if (yo4Var == null) {
            return;
        }
        ((ro4) yo4Var).b((j == -1 || j == 0) ? -1.0f : (j2 * 100.0f) / j, j, j2);
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        int i = 0;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                m20 m20Var = (m20) obj;
                long jN = ((p7b) ((au8) obj2).c).a.n();
                for (int i2 = 0; i2 < m20Var.b(); i2++) {
                    tpa.K(m20Var, m20Var.d(i2).r, new c10(jN, i));
                }
                break;
            case 7:
                j10 j10Var = (j10) obj;
                int iOrdinal = ((l20) obj2).a.ordinal();
                if (iOrdinal == 2) {
                    x10 x10Var = j10Var.b;
                    if (x10Var == null) {
                        x10Var = x10.w0;
                    }
                    w10 w10VarB = x10Var.b();
                    w10VarB.g = null;
                    j10Var.b = new x10(w10VarB);
                    break;
                } else if (iOrdinal == 3) {
                    h20 h20VarA = j10Var.c().a();
                    h20VarA.a = 0L;
                    h20VarA.l = null;
                    j10Var.d = new k20(h20VarA);
                    break;
                } else if (iOrdinal == 5) {
                    f20 f20Var = j10Var.f;
                    if (f20Var == null) {
                        f20Var = f20.p;
                    }
                    e20 e20Var = new e20();
                    long j = f20Var.a;
                    e20Var.d = f20Var.b;
                    e20Var.b = f20Var.c;
                    e20Var.c = f20Var.d;
                    e20Var.f = f20Var.e;
                    e20Var.g = f20Var.f;
                    e20Var.i = f20Var.g;
                    e20Var.h = f20Var.h;
                    e20Var.e = f20Var.i;
                    e20Var.j = f20Var.j;
                    e20Var.k = f20Var.k;
                    e20Var.l = f20Var.l;
                    e20Var.m = f20Var.m;
                    e20Var.n = f20Var.n;
                    e20Var.o = f20Var.o;
                    e20Var.a = 0L;
                    j10Var.f = e20Var.a();
                    break;
                } else if (iOrdinal == 9) {
                    r10 r10VarA = j10Var.b().a();
                    r10VarA.a = 0L;
                    r10VarA.d = null;
                    j10Var.r = new s10(r10VarA);
                    break;
                }
                break;
            case 8:
                ((bq7) ((we8) obj2)).q(((Long) obj).longValue());
                break;
            case 16:
                ((pkg) obj2).o = (te0) obj;
                break;
            case LangUtils.HASH_SEED /* 17 */:
                ((jc6) obj2).getClass();
                hm9.p("jc6", "onError", (Throwable) obj);
                break;
            default:
                mpa mpaVar = (mpa) obj;
                RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) obj2;
                rangeSeekBarView.G0.append(((Long) mpaVar.a).longValue(), (Bitmap) mpaVar.b);
                rangeSeekBarView.invalidate();
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public bm7 mo131apply(Object obj) {
        return ((k8b) this.b).d.o();
    }

    public void b(c54 c54Var) {
        lw1 lw1Var;
        q8b q8bVar = (q8b) this.b;
        q8bVar.getClass();
        if (!(c54Var instanceof eag) || (lw1Var = q8bVar.v0) == null) {
            return;
        }
        eag eagVar = (eag) c54Var;
        if (lw1Var.h() && lw1Var.s) {
            kq0.e();
            gag gagVar = (gag) lw1Var.u.d();
            if (gagVar == null) {
                return;
            }
            float fC = gagVar.c();
            float f = eagVar.f;
            lw1Var.o(Math.min(Math.max(fC * (f > 1.0f ? z7b.f(f, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - f) * 2.0f)), gagVar.b()), gagVar.a()));
        }
    }

    @Override // defpackage.i33
    public boolean d(ClickableSpan clickableSpan, int i, int i2, String str, lk7 lk7Var, MotionEvent motionEvent) {
        i33 i33Var = ((dy8) this.b).o;
        if (i33Var != null) {
            return i33Var.d(clickableSpan, i, i2, str, lk7Var, motionEvent);
        }
        return false;
    }

    @Override // defpackage.jw5
    public Widget e(String str, b bVar) {
        bc7[] bc7VarArr = PickerChatsTabWidget.y0;
        PickerChatsTabWidget pickerChatsTabWidget = (PickerChatsTabWidget) this.b;
        pickerChatsTabWidget.getClass();
        bc7[] bc7VarArr2 = PickerChatsTabWidget.y0;
        bc7 bc7Var = bc7VarArr2[0];
        String str2 = ((suc) pickerChatsTabWidget.a.a(pickerChatsTabWidget)).a;
        bc7 bc7Var2 = bc7VarArr2[1];
        boolean zBooleanValue = ((Boolean) pickerChatsTabWidget.b.a(pickerChatsTabWidget)).booleanValue();
        bc7 bc7Var3 = bc7VarArr2[2];
        PickerChatsListWidget pickerChatsListWidget = new PickerChatsListWidget(str, str2, (oa2) pickerChatsTabWidget.c.a(pickerChatsTabWidget), false, zBooleanValue, pickerChatsTabWidget.X, 8, null);
        pickerChatsListWidget.u0 = bVar;
        if (pickerChatsListWidget.isAttached()) {
            pickerChatsListWidget.p0().setRecycledViewPool(bVar);
        }
        return pickerChatsListWidget;
    }

    @Override // defpackage.pv6
    public void f(qv6 qv6Var) {
        i99 i99Var = (i99) this.b;
        synchronized (i99Var.a) {
            i99Var.c++;
        }
        i99Var.d(qv6Var);
    }

    @Override // defpackage.lde
    public Object get() {
        il9 il9Var = (il9) this.b;
        il9Var.getClass();
        StringBuilder sb = new StringBuilder("    ");
        int i = jpc.C2;
        Context context = (Context) il9Var.b;
        sb.append(context.getString(i));
        SpannableString spannableString = new SpannableString(sb.toString());
        Drawable drawableB = kt3.b(context, gpc.C);
        if (drawableB != null) {
            drawableB.setBounds(0, 0, drawableB.getIntrinsicWidth(), drawableB.getIntrinsicHeight());
            drawableB.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            spannableString.setSpan(new ncf(drawableB), 0, 3, 17);
        }
        return spannableString;
    }

    @Override // defpackage.o1d
    public int i(int i) {
        int i0 = ((efb) ((ol7) ((ProfileChangeLinkScreen) this.b).Y.C(i))).getI0();
        if ((536870911 & i0) == 2048) {
            return 0;
        }
        if (dy7.A(i0)) {
            return 1;
        }
        if (dy7.C(i0)) {
            return 2;
        }
        return dy7.B(i0) ? 3 : 4;
    }

    @Override // defpackage.grd
    public void j(final nqd nqdVar) {
        ((qoa) this.b).d.invoke(new y1e() { // from class: ooa
            @Override // defpackage.y1e
            public final void a(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, ar0[] ar0VarArr, Map map, yn1 yn1Var) {
                ((nqd) nqdVar).a(statsReportArr);
            }
        });
    }

    @Override // com.my.tracker.MyTrackerConfig.Logger
    public void log(int i, String str, Throwable th) {
        Object next;
        if (i >= ((int) ((qyc) this.b).q(PmsKey.f89mytrackerloglevel, 4))) {
            us7.c.getClass();
            Iterator it = us7.v0.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = u1Var.next();
                    if (((us7) next).a == i) {
                        break;
                    }
                }
            }
            us7 us7Var = (us7) next;
            if (us7Var == null) {
                us7Var = us7.o;
            }
            hm9.N(us7Var, "OneMeMyTracker", str, th);
        }
    }

    @Override // org.webrtc.RTCStatsCollectorCallback
    public void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        ((o1e) this.b).a(new n1e(rTCStatsReport));
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        qt1 qt1Var = (qt1) this.b;
        qt1Var.c = lq1Var;
        return "RequestCompleteListener[" + qt1Var + "]";
    }

    public /* synthetic */ yt8(xu3 xu3Var, yec yecVar) {
        this.a = 27;
        this.b = xu3Var;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        bu1 bu1Var;
        switch (this.a) {
            case 2:
                oy8 oy8Var = (oy8) obj;
                ky8 ky8Var = new ky8();
                iy8 iy8Var = (iy8) this.b;
                nw8 nw8Var = iy8Var.a;
                i20 i20Var = null;
                if (nw8Var == null) {
                    bu1Var = null;
                } else {
                    bu1Var = new bu1();
                    bu1Var.b = nw8Var.b;
                    bu1Var.a = nw8Var.a;
                    bu1Var.c = nw8Var.c;
                }
                ky8Var.a = bu1Var;
                ky8Var.c = iy8Var.c;
                ky8Var.b = iy8Var.b;
                ky8Var.d = iy8Var.d;
                ref refVar = iy8Var.e;
                if (refVar != null) {
                    i20Var = new i20();
                    i20Var.c = refVar.c;
                    i20Var.b = refVar.b;
                    i20Var.a = refVar.a;
                    i20Var.d = refVar.d;
                }
                ky8Var.e = i20Var;
                oy8Var.getClass();
                return new sa3(2, new uh(oy8Var, 12, ky8Var));
            case 3:
                oy8 oy8Var2 = (oy8) obj;
                nw8 nw8Var2 = (nw8) this.b;
                long j = nw8Var2.a;
                oy8Var2.getClass();
                return new sa3(2, new my8(oy8Var2, j, nw8Var2.b, nw8Var2.c));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new te0(new BitmapDrawable((Resources) this.b, (Bitmap) obj));
            case 26:
                d9c d9cVar = (d9c) obj;
                d9cVar.getClass();
                return new sa3(2, new uh(d9cVar, 22, (e9c) this.b));
            default:
                return (f28) this.b;
        }
    }
}
