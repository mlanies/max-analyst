package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.core.net.ParseException;
import java.util.HashMap;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import one.me.webview.FaqWebViewWidget;

/* loaded from: classes2.dex */
public final class tb5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ FaqWebViewWidget Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb5(FaqWebViewWidget faqWebViewWidget, Continuation continuation) {
        super(2, continuation);
        this.Z = faqWebViewWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tb5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tb5 tb5Var = new tb5(this.Z, continuation);
        tb5Var.Y = obj;
        return tb5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        String strDecode;
        String strSubstring;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        FaqWebViewWidget faqWebViewWidget = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var2 = (sx3) this.Y;
            xe5 xe5Var = faqWebViewWidget.X;
            this.Y = sx3Var2;
            this.X = 1;
            Object objB = xe5Var.b(this);
            if (objB == tx3Var) {
                return tx3Var;
            }
            obj = objB;
            sx3Var = sx3Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sx3Var = (sx3) this.Y;
            od2.a0(obj);
        }
        String str = (String) obj;
        str.getClass();
        if (!str.startsWith("mailto:")) {
            throw new ParseException("Not a mailto scheme");
        }
        int iIndexOf = str.indexOf(35);
        String strSubstring2 = iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
        int iIndexOf2 = strSubstring2.indexOf(63);
        if (iIndexOf2 == -1) {
            strDecode = Uri.decode(strSubstring2.substring(7));
            strSubstring = null;
        } else {
            strDecode = Uri.decode(strSubstring2.substring(7, iIndexOf2));
            strSubstring = strSubstring2.substring(iIndexOf2 + 1);
        }
        HashMap map = new HashMap();
        if (strSubstring != null) {
            for (String str2 : strSubstring.split("&")) {
                String[] strArrSplit = str2.split("=", 2);
                if (strArrSplit.length != 0) {
                    map.put(Uri.decode(strArrSplit[0]).toLowerCase(Locale.ROOT), strArrSplit.length > 1 ? Uri.decode(strArrSplit[1]) : null);
                }
            }
        }
        String str3 = (String) map.get("to");
        if (str3 != null) {
            strDecode = rh4.j(strDecode, ", ", str3);
        }
        map.put("to", strDecode);
        String strB = z7.B(faqWebViewWidget.getContext(), ola.a);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(str));
        intent.putExtra("android.intent.extra.SUBJECT", (String) map.get("subject"));
        intent.putExtra("android.intent.extra.CC", (String) map.get("cc"));
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("body"));
        try {
            faqWebViewWidget.startActivity(Intent.createChooser(intent, strB));
        } catch (ActivityNotFoundException e) {
            hm9.p(sx3Var.getClass().getName(), "error no email app found", e);
        }
        return e5f.a;
    }
}
