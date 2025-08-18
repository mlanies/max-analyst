package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsApiRequest;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class bqc implements grd, eqc, b7b, moc, qj3, o1d, i33, y2a, b66, rc7, pj3, za7, mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bqc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        yq0 yq0Var;
        g1e g1eVar = (g1e) this.b;
        if (g1eVar.g) {
            return x6gVar;
        }
        g1eVar.e = x6gVar;
        WindowInsets windowInsetsE = x6gVar.e();
        if (windowInsetsE != null) {
            if (Build.VERSION.SDK_INT < 31 || (yq0Var = g1eVar.b.b) == null || !yq0Var.c) {
                windowInsetsE = null;
            }
            if (windowInsetsE != null) {
                RoundedCorner roundedCorner = windowInsetsE.getRoundedCorner(3);
                int radius = roundedCorner != null ? roundedCorner.getRadius() : 0;
                RoundedCorner roundedCorner2 = windowInsetsE.getRoundedCorner(2);
                iMax = Math.max(radius / 2, (roundedCorner2 != null ? roundedCorner2.getRadius() : 0) / 2);
            }
        }
        g1eVar.f = iMax;
        g1eVar.c(x6gVar);
        return g1eVar.d(x6gVar);
    }

    @Override // defpackage.moc
    public void a(hoc hocVar, roc rocVar) {
        h7d h7dVar = (h7d) this.b;
        h7dVar.getClass();
        Integer num = ((fhc) rocVar).a;
        if (num != null) {
            h7dVar.D0.a.edit().putInt("estimatedPerformanceIndex", num.intValue()).apply();
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 7:
                j10 j10Var = (j10) obj;
                u10 u10Var = j10Var.v;
                if (u10Var == null) {
                    u10Var = u10.j;
                }
                t10 t10VarA = u10Var.a();
                t10VarA.a = (er7) obj2;
                j10Var.v = t10VarA.a();
                j10Var.i = d20.c;
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                hm9.p("a4e", String.format(Locale.ENGLISH, "storeStickerSetsFromServer: failed for %s", (Collection) obj2), (Throwable) obj);
                break;
            case 20:
                b04 b04Var = (b04) obj;
                gbe gbeVar = (gbe) obj2;
                gbeVar.getClass();
                long j = b04Var.b;
                gbeVar.b.getClass();
                fbe fbeVar = new fbe(j, kj6.d(b04Var.c, b04Var.a));
                gbeVar.o.add(fbeVar);
                long j2 = gbeVar.v0;
                if (j2 == -9223372036854775807L || b04Var.b >= j2) {
                    gbeVar.a(fbeVar);
                    break;
                }
                break;
            case 21:
                ((ww6) obj2).a((b04) obj);
                break;
            default:
                StringBuilder sb = new StringBuilder("process: failed for text ");
                sb.append(obj2);
                hm9.p("vpe", sb.toString(), (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.eqc, defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 1:
                Cursor cursor = (Cursor) obj;
                gqc gqcVar = (gqc) this.b;
                gqcVar.getClass();
                while (cursor.moveToNext()) {
                    gqcVar.U(cursor.getInt(0), rs7.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                return null;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                d2e d2eVar = (d2e) obj;
                o2e o2eVar = ((q2e) this.b).b;
                o2eVar.a.put(Long.valueOf(d2eVar.a), d2eVar);
                cqc.a(new p00(o2eVar, 11, d2eVar), o2eVar.h, null, new p4c(27), null);
                return iqd.g(d2eVar);
            case 16:
                b4e b4eVar = (b4e) obj;
                b4eVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM sticker_sets WHERE id IN (");
                long[] jArr = (long[]) this.b;
                int length = jArr == null ? 1 : jArr.length;
                a14.c(sb, length);
                sb.append(")");
                xlc xlcVarA = xlc.a(length, sb.toString());
                if (jArr == null) {
                    xlcVarA.W(1);
                } else {
                    int i = 1;
                    for (long j : jArr) {
                        xlcVarA.j(i, j);
                        i++;
                    }
                }
                return new t28(new uh(b4eVar, 27, xlcVarA));
            default:
                return ((qy9) obj).i(new dme((fme) this.b), Integer.MAX_VALUE);
        }
    }

    @Override // defpackage.i33
    public boolean d(ClickableSpan clickableSpan, int i, int i2, String str, lk7 lk7Var, MotionEvent motionEvent) {
        switch (this.a) {
            case 11:
                i33 onLinkLongClickListener = ((xkd) this.b).getOnLinkLongClickListener();
                if (onLinkLongClickListener != null && onLinkLongClickListener.d(clickableSpan, i, i2, str, lk7Var, motionEvent)) {
                    break;
                }
                break;
            default:
                i33 onLinkLongClickListener2 = ((ppe) this.b).getOnLinkLongClickListener();
                if (onLinkLongClickListener2 != null && onLinkLongClickListener2.d(clickableSpan, i, i2, str, lk7Var, motionEvent)) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.o1d
    public int i(int i) {
        switch (this.a) {
            case 8:
                d1d d1dVar = (d1d) ((ol7) ((SettingMediaScreen) this.b).X.C(i));
                int iA = d1dVar.a();
                if (d1dVar.g()) {
                    return iA;
                }
                return 0;
            case 9:
                z0d z0dVar = (z0d) ((ol7) ((SettingsPrivacyScreen) this.b).Y.C(i));
                int iA2 = z0dVar.a();
                if (z0dVar.g()) {
                    return iA2;
                }
                return 0;
            case 10:
                l1d l1dVar = (l1d) ((ol7) ((SettingsStorageScreen) this.b).c.C(i));
                int iA3 = l1dVar.a();
                if (l1dVar.g()) {
                    return iA3;
                }
                return 0;
            default:
                y0d y0dVar = (y0d) ((ol7) ((StickersSettingsScreen) this.b).X.C(i));
                if (y0dVar.a() != 0) {
                    return y0dVar.a();
                }
                return 0;
        }
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) {
        switch (this.a) {
            case 0:
                nqdVar.a(((Callable) this.b).call());
                break;
            default:
                ((m56) ((vk8) this.b).e).invoke(new g0e(nqdVar));
                break;
        }
    }

    @Override // defpackage.za7
    public Object parse(db7 db7Var) {
        return SupportedCodecsApiRequest._get_okParser_$lambda$0((SupportedCodecsApiRequest) this.b, db7Var);
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        switch (this.a) {
            case 23:
                hee heeVar = (hee) this.b;
                heeVar.o = lq1Var;
                return "SettableFuture hashCode: " + heeVar.hashCode();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((kee) this.b).v0 = lq1Var;
                return "SurfaceOutputImpl close future complete";
            default:
                ((hre) this.b).k.set(lq1Var);
                return "textureViewImpl_waitForNextFrame";
        }
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                r4d r4dVar = (r4d) obj;
                if (!nd7.c((Set) this.b, new bqc(5, r4dVar))) {
                    up7 up7Var = r4dVar.a;
                    if (!(up7Var instanceof j00) && !up7Var.c.startsWith("content://")) {
                        return true;
                    }
                }
                return false;
            case 5:
                return kp.e((Uri) obj, ((r4d) this.b).a.c());
            default:
                return ((wua) obj).Y == ((uj3) this.b).o();
        }
    }
}
