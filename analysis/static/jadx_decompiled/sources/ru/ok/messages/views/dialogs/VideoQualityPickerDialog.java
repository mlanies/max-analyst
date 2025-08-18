package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import defpackage.are;
import defpackage.c63;
import defpackage.d10;
import defpackage.dy7;
import defpackage.fm9;
import defpackage.hm9;
import defpackage.jpc;
import defpackage.khe;
import defpackage.kpa;
import defpackage.mqb;
import defpackage.nqb;
import defpackage.oc;
import defpackage.okf;
import defpackage.p46;
import defpackage.qqb;
import defpackage.s08;
import defpackage.sme;
import defpackage.wg0;
import defpackage.z53;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/dialogs/VideoQualityPickerDialog;", "Lru/ok/messages/views/dialogs/FrgDlgBase;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class VideoQualityPickerDialog extends FrgDlgBase {
    public static final VideoQualityPickerDialog n1(ArrayList arrayList, mqb mqbVar, boolean z) {
        VideoQualityPickerDialog videoQualityPickerDialog = new VideoQualityPickerDialog();
        c63.U(arrayList, nqb.g);
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new qqb((nqb) it.next()));
        }
        videoQualityPickerDialog.X0(dy7.g(new kpa("ru.ok.tamtam.extra.QUALITIES", arrayList2), new kpa("ru.ok.tamtam.extra.CURRENT_QUALITY", mqbVar), new kpa("ru.ok.tamtam.extra.SHOW_SIZE", Boolean.valueOf(z))));
        return videoQualityPickerDialog;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog h1() {
        int i;
        boolean z = true;
        ArrayList parcelableArrayList = T0().getParcelableArrayList("ru.ok.tamtam.extra.QUALITIES");
        boolean z2 = T0().getBoolean("ru.ok.tamtam.extra.SHOW_SIZE");
        mqb mqbVar = (mqb) T0().getSerializable("ru.ok.tamtam.extra.CURRENT_QUALITY");
        if (mqbVar != null) {
            Iterator it = parcelableArrayList.iterator();
            i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((qqb) it.next()).a.a == mqbVar) {
                    break;
                }
                i++;
            }
        } else {
            i = 0;
        }
        Context contextU0 = U0();
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(contextU0);
        ArrayList arrayList = new ArrayList(z53.S(parcelableArrayList, 10));
        Iterator it2 = parcelableArrayList.iterator();
        while (it2.hasNext()) {
            nqb nqbVar = ((qqb) it2.next()).a;
            boolean z3 = nqbVar.f;
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) nqbVar.a.a);
            if (z2) {
                String strW = are.w(nqbVar.e, z, null);
                spannableStringBuilderAppend.append(' ').append(z3 ? wg0.i("– ", strW) : wg0.i("~ ", strW), new ForegroundColorSpan(smeVarR.M), 34);
            }
            if (z3) {
                spannableStringBuilderAppend.append(' ').append(wg0.i("– ", h0(jpc.O1)), new ForegroundColorSpan(smeVarR.M), 17);
            }
            arrayList.add(spannableStringBuilderAppend);
            z = true;
        }
        s08 s08VarE = new s08(U0()).e(h0(jpc.v3));
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new SpannableStringBuilder[0]);
        p46 p46Var = new p46(this, parcelableArrayList, 5);
        oc ocVar = s08VarE.a;
        ocVar.p = charSequenceArr;
        ocVar.r = p46Var;
        ocVar.u = i;
        ocVar.t = true;
        String strH0 = h0(jpc.r);
        d10 d10Var = new d10(4, this);
        oc ocVar2 = s08VarE.a;
        ocVar2.k = strH0;
        ocVar2.l = d10Var;
        return s08VarE.a();
    }

    public final void o1(okf okfVar) {
        hm9.n("ru.ok.messages.views.dialogs.VideoQualityPickerDialog", "set fragment result " + okfVar);
        f0().e0("VideoQualityPickerDialog:result:request", dy7.g(new kpa("VideoQualityPickerDialog:result:key", okfVar)));
        f1(false, false);
    }
}
