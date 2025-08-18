package defpackage;

import android.view.View;
import android.widget.EditText;
import one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class v7d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v7d(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q0e q0eVar;
        Object value;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                ServerPortBottomSheet serverPortBottomSheet = (ServerPortBottomSheet) obj2;
                CharSequence text = ((cka) serverPortBottomSheet.z0.T0(serverPortBottomSheet, ServerPortBottomSheet.B0[0])).getText();
                if (!(text == null || text.length() == 0)) {
                    l6b l6bVar = (l6b) serverPortBottomSheet.y0.getValue();
                    j47.T(l6bVar.a, ((w9a) ((kke) l6bVar.c.getValue())).b().plus(xq9.a), null, new k6b(l6bVar, text.toString(), new zja((OneMeButton) obj, 18, serverPortBottomSheet), null), 2);
                    break;
                }
                break;
            case 1:
                bc7[] bc7VarArr = SettingsBlacklistScreen.Z;
                ped pedVarM0 = ((SettingsBlacklistScreen) ((gaa) obj2).a).m0();
                pedVarM0.x0.o1(pedVarM0, ped.z0[0], j47.S(pedVarM0.a, ((w9a) ((kke) pedVarM0.s0.getValue())).a(), vx3.b, new ned(pedVarM0, ((wo0) ((ol7) obj)).a, null)));
                break;
            case 2:
                ((lfd) obj2).i(((kfd) obj).getItemId());
                break;
            case 3:
                bc7[] bc7VarArr2 = SettingMediaScreen.Y;
                ((SettingMediaScreen) ((fd7) obj2).a).m0().s((int) ((c1d) ((ol7) obj)).o);
                break;
            case 4:
                bc7[] bc7VarArr3 = SettingsPrivacyScreen.Z;
                cid cidVarM0 = ((SettingsPrivacyScreen) ((qqd) obj2).b).m0();
                cidVarM0.getClass();
                long j = jha.j;
                long j2 = ((v0d) ((ol7) obj)).o;
                if (j2 != j) {
                    if (j2 != jha.e) {
                        if (j2 != jha.c) {
                            if (j2 != jha.k) {
                                if (j2 != jha.d) {
                                    if (j2 != jha.f) {
                                        if (j2 != jha.i) {
                                            if (j2 != jha.h) {
                                                if (j2 == jha.b) {
                                                    if (!((qyc) cidVarM0.v()).v() || !cidVarM0.s().r()) {
                                                        cidVarM0.w(aed.l);
                                                        break;
                                                    } else {
                                                        cidVarM0.K0 = j2;
                                                        if (!cidVarM0.t().b()) {
                                                            cidVarM0.w(xdd.b);
                                                            break;
                                                        } else {
                                                            cidVarM0.x();
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else if (cidVarM0.s().r() && !cidVarM0.t().b()) {
                                                cidVarM0.w(xdd.b);
                                                break;
                                            }
                                        } else if (!((qyc) cidVarM0.v()).v() || !cidVarM0.s().r()) {
                                            cidVarM0.w(aed.i);
                                            break;
                                        } else {
                                            cidVarM0.K0 = j2;
                                            if (!cidVarM0.t().b()) {
                                                cidVarM0.w(xdd.b);
                                                break;
                                            } else {
                                                cidVarM0.x();
                                                break;
                                            }
                                        }
                                    } else {
                                        cidVarM0.w(aed.k);
                                        break;
                                    }
                                } else {
                                    ihd.c.getClass();
                                    cidVarM0.w(new c64(":settings/blacklist"));
                                    break;
                                }
                            } else {
                                ihd.c.getClass();
                                cidVarM0.w(new c64(":settings/webapps"));
                                break;
                            }
                        } else if (!((qyc) cidVarM0.v()).v() || !cidVarM0.s().r()) {
                            cidVarM0.w(aed.j);
                            break;
                        } else {
                            cidVarM0.K0 = j2;
                            if (!cidVarM0.t().b()) {
                                cidVarM0.w(xdd.b);
                                break;
                            } else {
                                cidVarM0.x();
                                break;
                            }
                        }
                    } else if (!((qyc) cidVarM0.v()).v() || !cidVarM0.s().r()) {
                        cidVarM0.w(aed.h);
                        break;
                    } else {
                        cidVarM0.K0 = j2;
                        if (!cidVarM0.t().b()) {
                            cidVarM0.w(xdd.b);
                            break;
                        } else {
                            cidVarM0.x();
                            break;
                        }
                    }
                } else {
                    cidVarM0.w(aed.f);
                    break;
                }
                break;
            case 5:
                ((tmd) obj2).J0.setProgressEnabled(true);
                ((k56) obj).invoke();
                break;
            case 6:
                xpd xpdVar = (xpd) obj2;
                xpdVar.b.invoke(Integer.valueOf(((wpd) obj).a));
                xpdVar.dismiss();
                break;
            case 7:
                bc7[] bc7VarArr4 = StartRecordBottomSheet.A0;
                StartRecordBottomSheet startRecordBottomSheet = (StartRecordBottomSheet) obj2;
                xzd xzdVar = (xzd) startRecordBottomSheet.z0.getValue();
                String text2 = ((EditText) obj).getText();
                el1 el1Var = xzdVar.b;
                if (text2 != null && w9e.C0(text2) && text2.length() > 0) {
                    pnf.o(el1Var.M0, wj1.z);
                    break;
                } else {
                    if (!(!(text2 == null || text2.length() == 0))) {
                        text2 = null;
                    }
                    if (text2 == null) {
                        m31 m31Var = ((la1) el1Var.C0.a.getValue()).f;
                        CharSequence charSequence = m31Var != null ? m31Var.b : null;
                        text2 = charSequence == null ? "" : charSequence;
                    }
                    pnf.o(el1Var.M0, new mj1(text2));
                    startRecordBottomSheet.s0(true);
                    break;
                }
                break;
            case 8:
                z2e z2eVar = ((jw7) obj2).H0;
                if (z2eVar != null) {
                    ((w2e) obj).k(z2eVar);
                    break;
                }
                break;
            case 9:
                y0d y0dVar = ((s3e) obj2).J0;
                if (y0dVar != null) {
                    ((m56) obj).invoke(y0dVar);
                    break;
                }
                break;
            case 10:
                h4e h4eVar = (h4e) obj2;
                e02 e02Var = h4eVar.L0;
                if (e02Var != null) {
                    ((OneMeDraweeView) h4eVar.a).setBackground(h4eVar.F0);
                    ((m56) obj).invoke(Long.valueOf(e02Var.b.a));
                    break;
                }
                break;
            case 11:
                y0d y0dVar2 = ((i6e) obj2).F0;
                if (y0dVar2 != null) {
                    ((m56) obj).invoke(y0dVar2);
                    break;
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) ((oce) obj2);
                yce yceVarB0 = suggestionsWidget.B0();
                do {
                    q0eVar = yceVarB0.I0;
                    value = q0eVar.getValue();
                } while (!q0eVar.c(value, (rce) obj));
                suggestionsWidget.C0();
                break;
            case 13:
                ((m56) obj2).invoke(((vre) obj).a);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((m56) obj2).invoke((wre) obj);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                k56 k56Var = (k56) obj2;
                if (k56Var != null) {
                    k56Var.invoke();
                }
                ((ywe) obj).a();
                break;
            case 16:
                ((m56) obj2).invoke(((x9f) obj).o);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                w2g w2gVar = ((y2g) obj2).F0;
                u2g u2gVar = w2gVar instanceof u2g ? (u2g) w2gVar : null;
                if (u2gVar != null) {
                    ((x2g) obj).b(u2gVar, !((ffd) u2gVar.a.Z).a);
                    break;
                }
                break;
            case 18:
                w2g w2gVar2 = ((z2g) obj2).F0;
                if (w2gVar2 != null) {
                    ((m56) obj).invoke(w2gVar2);
                    break;
                }
                break;
            default:
                z2e z2eVar2 = ((jw7) obj2).H0;
                if (z2eVar2 != null) {
                    ((w2e) obj).k(z2eVar2);
                    break;
                }
                break;
        }
    }
}
