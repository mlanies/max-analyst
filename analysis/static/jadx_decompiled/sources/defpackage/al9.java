package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.trim.ActTrimVideo;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class al9 implements tj3 {
    public final /* synthetic */ int a;

    public /* synthetic */ al9(int i) {
        this.a = i;
    }

    @Override // defpackage.tj3
    public final void accept(Object obj) {
        final int i = 0;
        final int i2 = 1;
        switch (this.a) {
            case 0:
                zj9 zj9Var = (zj9) obj;
                zj9Var.getClass();
                hm9.n("zj9", "onCropButtonClicked()");
                up7 up7Var = zj9Var.X;
                if (up7Var == null || up7Var.a != 1 || up7Var.d()) {
                    return;
                }
                zj9Var.v0.f("LOCAL_MEDIA_CROP");
                File fileA = zj9Var.x0.a("jpg");
                String strA = zj9Var.X.a();
                awa awaVar = zj9Var.u0;
                Uri uri = awaVar != null ? awaVar.b : null;
                Uri uri2 = awaVar != null ? awaVar.a : null;
                if (uri2 != null && uri == null) {
                    strA = uri2.getPath();
                }
                awa awaVar2 = zj9Var.u0;
                nz3 nz3Var = awaVar2 != null ? awaVar2.c : null;
                ov4 ov4Var = awaVar2 != null ? awaVar2.o : null;
                if ((nz3Var == null && uri != null) || (nz3Var != null && ov4Var != null)) {
                    strA = uri.getPath();
                }
                Uri uri3 = Uri.parse(strA);
                hm9.n("zj9", "startCrop()");
                awa awaVar3 = zj9Var.u0;
                parcelable = awaVar3 != null ? awaVar3.X : null;
                if (parcelable == null) {
                    ((ActLocalMedias) zj9Var.c).s0(uri3, fileA, nz3Var);
                    return;
                }
                hm9.n("zj9", "startCrop() media has overlay, processing");
                bn0 bn0Var = zj9Var.y0;
                bn0Var.getClass();
                u00 u00Var = new u00(bn0Var, uri3, parcelable, 20);
                iq1 iq1Var = new iq1(new y98(zj9Var, 14, fileA), 2, new vj9(zj9Var, i));
                Objects.requireNonNull(iq1Var, "observer is null");
                try {
                    nqd nqdVar = new nqd(iq1Var);
                    iq1Var.c(nqdVar);
                    try {
                        u00Var.j(nqdVar);
                        return;
                    } catch (Throwable th) {
                        c37.B(th);
                        nqdVar.onError(th);
                        return;
                    }
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th2) {
                    c37.B(th2);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th2);
                    throw nullPointerException;
                }
            case 1:
                ((zj9) obj).a2();
                return;
            case 2:
                zj9 zj9Var2 = (zj9) obj;
                zj9Var2.getClass();
                hm9.k("zj9", "onTrimButtonClicked");
                up7 up7Var2 = zj9Var2.X;
                if (up7Var2 == null || !up7Var2.b()) {
                    return;
                }
                String str = zj9Var2.X.c;
                ref refVar = zj9Var2.t0;
                float f = refVar.b;
                float f2 = zj9Var2.s0;
                long j = (long) (f * f2);
                long j2 = (long) (refVar.c * f2);
                ActLocalMedias actLocalMedias = (ActLocalMedias) zj9Var2.c;
                actLocalMedias.getClass();
                Uri uri4 = Uri.parse(str);
                Intent intent = new Intent(actLocalMedias, (Class<?>) ActTrimVideo.class);
                intent.putExtra("ru.ok.tamtam.extra.VIDEO_URI", uri4);
                intent.putExtra("ru.ok.tamtam.extra.START_POSITION", j);
                intent.putExtra("ru.ok.tamtam.extra.END_POSITION", j2);
                intent.putExtra("ru.ok.tamtam.extra.MUTE", refVar.d);
                actLocalMedias.startActivityForResult(intent, 1);
                return;
            case 3:
                zj9 zj9Var3 = (zj9) obj;
                up7 up7Var3 = zj9Var3.X;
                if (up7Var3 == null || up7Var3.a != 1 || up7Var3.d()) {
                    return;
                }
                awa awaVar4 = zj9Var3.u0;
                ov4 ov4Var2 = awaVar4 != null ? awaVar4.o : null;
                up7 up7Var4 = zj9Var3.X;
                if (awaVar4 != null && awaVar4.X != null) {
                    parcelable = ov4Var2;
                }
                Uri uriA = awa.a(awaVar4, up7Var4);
                ActLocalMedias actLocalMedias2 = (ActLocalMedias) zj9Var3.c;
                actLocalMedias2.getClass();
                if (uriA == null) {
                    Intent intent2 = new Intent(actLocalMedias2, (Class<?>) ActPhotoEditor.class);
                    intent2.putExtra("photo_editor:is_drawing", true);
                    if (parcelable != null) {
                        intent2.putExtra("photo_editor:editor_state", parcelable);
                    }
                    intent2.putExtra("photo_editor:draw_sticker_enabled", false);
                    actLocalMedias2.startActivityForResult(intent2, 3);
                    return;
                }
                Intent intent3 = new Intent(actLocalMedias2, (Class<?>) ActPhotoEditor.class);
                intent3.putExtra("photo_editor:background_uri", uriA);
                if (parcelable != null) {
                    intent3.putExtra("photo_editor:editor_state", parcelable);
                }
                intent3.putExtra("photo_editor:draw_sticker_enabled", false);
                actLocalMedias2.startActivityForResult(intent3, 3);
                return;
            case 4:
                zj9 zj9Var4 = (zj9) obj;
                zj9Var4.getClass();
                hm9.k("zj9", "On mute button clicked");
                ref refVar2 = zj9Var4.t0;
                boolean z = refVar2.d;
                final boolean z2 = !z;
                i20 i20VarA = refVar2.a();
                i20VarA.d = z2;
                zj9Var4.t0 = i20VarA.a();
                zj9Var4.c2();
                zj9Var4.d2(new l66() { // from class: wj9
                    @Override // defpackage.l66
                    public final Object apply(Object obj2) {
                        oq7 oq7Var = (oq7) obj2;
                        oq7Var.n = z2;
                        return oq7Var;
                    }
                });
                tj9 tj9Var = zj9Var4.c;
                if (tj9Var != null) {
                    ((ActLocalMedias) tj9Var).p0(z, true);
                }
                zj9Var4.v0.d(z2 ? 1 : 0, "MUTE_VIDEO_BEFORE_SEND");
                return;
            case 5:
                ((ol9) obj).V0();
                return;
            case 6:
                ((ol9) obj).J1();
                return;
            case 7:
                ((ol9) obj).I1();
                return;
            case 8:
                final hk9 hk9Var = (hk9) obj;
                hk9Var.o.f("ACTION_LOCAL_MEDIA_TRIM_APPLY");
                nl9 nl9Var = (nl9) ((kk9) hk9Var.b);
                AppCompatImageButton appCompatImageButton = nl9Var.C0;
                tg tgVar = nl9Var.Z;
                tgVar.g(appCompatImageButton);
                tgVar.i(nl9Var.D0);
                j47.l0((ViewGroup) ((View) nl9Var.c));
                long j3 = hk9Var.s0;
                FrgTrimVideo frgTrimVideo = hk9Var.c;
                frgTrimVideo.getClass();
                new q1a(1, new x72(frgTrimVideo, hk9Var.X, j3, 6)).m(muc.a()).i(ce.a()).k(new iq1(new qj3() { // from class: gk9
                    @Override // defpackage.qj3
                    public final void accept(Object obj2) {
                        switch (i2) {
                            case 0:
                                hk9 hk9Var2 = hk9Var;
                                long jF = ((bq7) hk9Var2.Y).f();
                                hk9Var2.u0 = jF;
                                if (jF <= hk9Var2.t0) {
                                    ((nl9) ((kk9) hk9Var2.b)).y0.setPointerPosition(jF);
                                    break;
                                } else {
                                    hk9Var2.a2();
                                    break;
                                }
                            default:
                                hk9 hk9Var3 = hk9Var;
                                long j4 = hk9Var3.s0;
                                long j5 = hk9Var3.t0;
                                FrgTrimVideo frgTrimVideo2 = hk9Var3.c;
                                frgTrimVideo2.getClass();
                                Intent intent4 = new Intent();
                                intent4.putExtra("ru.ok.tamtam.extra.START_POSITION", j4);
                                intent4.putExtra("ru.ok.tamtam.extra.END_POSITION", j5);
                                intent4.putExtra("ru.ok.tamtam.extra.THUMBNAIL_URI", (String) obj2);
                                frgTrimVideo2.g1().setResult(-1, intent4);
                                frgTrimVideo2.r1();
                                frgTrimVideo2.e1();
                                break;
                        }
                    }
                }, 2, new jj9(13)));
                return;
            case 9:
                ((hk9) obj).pause();
                return;
            case 10:
                hk9 hk9Var2 = (hk9) obj;
                long j4 = hk9Var2.s0;
                long j5 = hk9Var2.Z;
                if (j4 == 0 && hk9Var2.t0 == j5) {
                    return;
                }
                hk9Var2.a2();
                hk9Var2.s0 = 0L;
                hk9Var2.t0 = j5;
                nl9 nl9Var2 = (nl9) ((kk9) hk9Var2.b);
                nl9Var2.y0.setStartPosition(0L);
                nl9Var2.y0.setEndPosition(hk9Var2.t0);
                nl9Var2.y0.setPointerPosition(hk9Var2.s0);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                nl9Var2.w0.setText(ay7.l(timeUnit.toSeconds(hk9Var2.s0)));
                nl9Var2.x0.setText(ay7.l(timeUnit.toSeconds(hk9Var2.t0)));
                ((bq7) hk9Var2.Y).q(hk9Var2.s0);
                hk9Var2.c2();
                return;
            case 11:
                FrgTrimVideo frgTrimVideo2 = ((hk9) obj).c;
                frgTrimVideo2.r1();
                frgTrimVideo2.e1();
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                final hk9 hk9Var3 = (hk9) obj;
                ((bq7) hk9Var3.Y).o();
                cqc.b(hk9Var3.x0);
                o0a o0aVarK = qy9.k(30L, 30L, TimeUnit.MILLISECONDS, ce.a());
                sd7 sd7Var = new sd7(new qj3() { // from class: gk9
                    @Override // defpackage.qj3
                    public final void accept(Object obj2) {
                        switch (i) {
                            case 0:
                                hk9 hk9Var22 = hk9Var3;
                                long jF = ((bq7) hk9Var22.Y).f();
                                hk9Var22.u0 = jF;
                                if (jF <= hk9Var22.t0) {
                                    ((nl9) ((kk9) hk9Var22.b)).y0.setPointerPosition(jF);
                                    break;
                                } else {
                                    hk9Var22.a2();
                                    break;
                                }
                            default:
                                hk9 hk9Var32 = hk9Var3;
                                long j42 = hk9Var32.s0;
                                long j52 = hk9Var32.t0;
                                FrgTrimVideo frgTrimVideo22 = hk9Var32.c;
                                frgTrimVideo22.getClass();
                                Intent intent4 = new Intent();
                                intent4.putExtra("ru.ok.tamtam.extra.START_POSITION", j42);
                                intent4.putExtra("ru.ok.tamtam.extra.END_POSITION", j52);
                                intent4.putExtra("ru.ok.tamtam.extra.THUMBNAIL_URI", (String) obj2);
                                frgTrimVideo22.g1().setResult(-1, intent4);
                                frgTrimVideo22.r1();
                                frgTrimVideo22.e1();
                                break;
                        }
                    }
                }, ft.f, ft.d);
                o0aVarK.a(sd7Var);
                hk9Var3.x0 = sd7Var;
                return;
            case 13:
                hk9 hk9Var4 = (hk9) obj;
                boolean z3 = !hk9Var4.y0;
                hk9Var4.y0 = z3;
                ((nl9) ((kk9) hk9Var4.b)).C(z3, ((bq7) hk9Var4.Y).k());
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                qv4 qv4Var = ((zva) obj).b;
                ArrayList arrayList = qv4Var.d;
                if (arrayList.isEmpty()) {
                    return;
                }
                s9 s9Var = (s9) wg0.f(arrayList, 1);
                uv4 uv4Var = qv4Var.a;
                s9Var.a(uv4Var);
                arrayList.remove(s9Var);
                qv4Var.e.add(s9Var);
                uv4Var.invalidate();
                qv4Var.b();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((ActPhotoEditor) ((zva) obj).c).j0();
                return;
            case 16:
                ActPhotoEditor actPhotoEditor = (ActPhotoEditor) ((zva) obj).c;
                if (((Boolean) actPhotoEditor.Y0.getValue()).booleanValue()) {
                    actPhotoEditor.k0(null);
                    return;
                } else {
                    ScheduledSendPickerDialogFragment.q1("ru.ok.messages.photoeditor.ActPhotoEditor", actPhotoEditor.S());
                    return;
                }
            case LangUtils.HASH_SEED /* 17 */:
                ActPhotoEditor actPhotoEditor2 = (ActPhotoEditor) ((zva) obj).c;
                actPhotoEditor2.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", jpc.k2);
                bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", jpc.n2);
                bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", jpc.r);
                ConfirmationDialog confirmationDialog = new ConfirmationDialog();
                confirmationDialog.X0(bundle);
                confirmationDialog.k1(actPhotoEditor2.S(), "ru.ok.messages.views.dialogs.ConfirmationDialog");
                return;
            case 18:
                zva zvaVar = (zva) obj;
                qv4 qv4Var2 = zvaVar.b;
                boolean z4 = !qv4Var2.a().o;
                cwa cwaVar = zvaVar.e;
                cwaVar.getClass();
                cwa cwaVar2 = new cwa(cwaVar.a, cwaVar.b, cwaVar.c, cwaVar.o, z4, cwaVar.Y, cwaVar.Z);
                zvaVar.e = cwaVar2;
                zvaVar.a.a(cwaVar2);
                qv4Var2.a.setDrawStickerEnabled(z4);
                zvaVar.d.f(qv4Var2, qv4Var2.a(), false);
                ActPhotoEditor actPhotoEditor3 = (ActPhotoEditor) zvaVar.c;
                if (z4) {
                    if (actPhotoEditor3.X0 == null) {
                        actPhotoEditor3.X0 = new gaa(((y8a) ((ed3) actPhotoEditor3.K0.b)).b());
                    }
                    ((ad) actPhotoEditor3.X0.a).f("DRAW_AS_STICKER_TAP");
                    return;
                } else {
                    if (actPhotoEditor3.X0 == null) {
                        actPhotoEditor3.X0 = new gaa(((y8a) ((ed3) actPhotoEditor3.K0.b)).b());
                    }
                    ((ad) actPhotoEditor3.X0.a).f("DRAW_REGULAR_TAP");
                    return;
                }
            case 19:
                ((lc0) obj).d = Integer.valueOf(adc.k0.d);
                return;
            case 20:
                return;
            default:
                Throwable th3 = (Throwable) obj;
                hm9.p("VideoMessageCameraEffect", "Failed init camera effect due to " + th3.getLocalizedMessage(), th3);
                return;
        }
    }
}
