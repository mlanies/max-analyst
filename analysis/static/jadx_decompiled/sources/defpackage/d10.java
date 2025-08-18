package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.Map;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.views.dialogs.FrgDlgAudioTracksPicker;
import ru.ok.messages.views.dialogs.FrgDlgStopLiveLocation;
import ru.ok.messages.views.dialogs.LoadMediaDialog;
import ru.ok.messages.views.dialogs.VideoQualityPickerDialog;

/* loaded from: classes2.dex */
public final /* synthetic */ class d10 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d10(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int iIntValue;
        cu8 cu8Var;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                ArrayList arrayList = hm9.l;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    break;
                } catch (Exception e) {
                    hm9.p("hm9", e.getMessage(), e);
                    return;
                }
            case 1:
                FrgDlgAudioTracksPicker frgDlgAudioTracksPicker = (FrgDlgAudioTracksPicker) obj;
                a aVar = frgDlgAudioTracksPicker.I0;
                FrgAttachVideo frgAttachVideo = (FrgAttachVideo) (aVar != null ? FrgAttachVideo.class.cast(aVar) : FrgAttachVideo.class.cast(frgDlgAudioTracksPicker.b0()));
                lze lzeVar = (lze) frgDlgAudioTracksPicker.F1.get(i);
                frgAttachVideo.getClass();
                hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "onAudioTrackSelected %s", lzeVar);
                lj9 lj9Var = frgAttachVideo.N1;
                if (lj9Var != null) {
                    hm9.m("lj9", "selectAudioTrack %s", lzeVar);
                    if (lj9Var.b2()) {
                        l20 l20Var = lj9Var.y0;
                        if (l20Var != null && (cu8Var = lj9Var.x0) != null) {
                            int i2 = lzeVar.t0;
                            au8 au8Var = lj9Var.s0;
                            au8Var.getClass();
                            au8Var.t(cu8Var, l20Var.r, new h75(i2, lzeVar.s0, 5));
                        }
                        bq7 bq7Var = (bq7) lj9Var.c;
                        if (bq7Var.f != null) {
                            u65 u65Var = bq7Var.b;
                            u65Var.getClass();
                            hm9.m("u65", "selectAudioTrack: %s", lzeVar);
                            u65.u();
                            lze lzeVar2 = lze.u0;
                            kad kadVar = u65Var.b;
                            bf4 bf4Var = (bf4) kadVar.a;
                            if (lzeVar == lzeVar2) {
                                ez7 ez7Var = bf4Var.c;
                                if (ez7Var != null && (iIntValue = ((Integer) kadVar.d(ez7Var).second).intValue()) >= 0) {
                                    pe4 pe4VarB = bf4Var.b();
                                    SparseArray sparseArray = pe4VarB.M;
                                    Map map = (Map) sparseArray.get(iIntValue);
                                    if (map != null && !map.isEmpty()) {
                                        sparseArray.remove(iIntValue);
                                    }
                                    bf4Var.h(pe4VarB);
                                }
                            } else {
                                ez7 ez7Var2 = bf4Var.c;
                                if (ez7Var2 != null) {
                                    qe4 qe4Var = new qe4(lzeVar.s0, 0, new int[]{lzeVar.t0});
                                    sze[] szeVarArr = ez7Var2.c;
                                    int i3 = lzeVar.Z;
                                    sze szeVar = szeVarArr[i3];
                                    pe4 pe4VarB2 = bf4Var.b();
                                    pe4VarB2.e(i3, szeVar, qe4Var);
                                    bf4Var.h(pe4VarB2);
                                }
                            }
                        }
                    }
                }
                frgDlgAudioTracksPicker.f1(false, false);
                break;
            case 2:
                ((FrgDlgStopLiveLocation) obj).f1(false, false);
                break;
            case 3:
                LoadMediaDialog loadMediaDialog = (LoadMediaDialog) obj;
                a aVarI0 = loadMediaDialog.i0(true);
                if (aVarI0 != null) {
                    Intent intent = new Intent();
                    intent.putExtra("ru.ok.tamtam.extra.SETTING_ID", loadMediaDialog.T0().getInt("ru.ok.tamtam.extra.SETTING_ID"));
                    if (i == 0) {
                        intent.putExtra("ru.ok.tamtam.extra.RESULT_ITEM", 0);
                    } else if (i == 1) {
                        intent.putExtra("ru.ok.tamtam.extra.RESULT_ITEM", 1);
                    } else if (i == 2) {
                        intent.putExtra("ru.ok.tamtam.extra.RESULT_ITEM", -1);
                    }
                    aVarI0.s0(loadMediaDialog.j0(), -1, intent);
                    break;
                }
                break;
            default:
                ((VideoQualityPickerDialog) obj).o1(mkf.a);
                break;
        }
    }
}
