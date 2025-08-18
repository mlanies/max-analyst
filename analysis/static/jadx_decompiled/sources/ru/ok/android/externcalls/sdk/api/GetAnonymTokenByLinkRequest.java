package ru.ok.android.externcalls.sdk.api;

import android.net.Uri;
import defpackage.b0;
import defpackage.db7;
import defpackage.el;
import defpackage.ig5;
import defpackage.kl;
import defpackage.ll;
import defpackage.nd2;
import defpackage.sl;
import defpackage.xk;
import defpackage.yk;
import defpackage.za7;
import java.io.IOException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonParseException;

/* loaded from: classes2.dex */
public class GetAnonymTokenByLinkRequest extends b0 implements yk {
    private static final za7 PARSER = new ig5(19);
    public final String joinLink;
    public final String name;

    public static final class Response {
        public final String token;
        public final String uid;

        public Response(String str, String str2) {
            this.uid = str;
            this.token = str2;
        }
    }

    public GetAnonymTokenByLinkRequest(String str, String str2) {
        this.joinLink = str;
        this.name = str2;
    }

    public static boolean isAuthRequired(ApiInvocationException apiInvocationException) {
        return apiInvocationException.a == 457;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Response lambda$static$0(db7 db7Var) throws JsonParseException, IOException {
        db7Var.s();
        String strH = null;
        String strH2 = null;
        while (db7Var.hasNext()) {
            String strT = db7Var.T();
            strT.getClass();
            if (strT.equals("uid")) {
                strH = db7Var.H();
            } else if (strT.equals(ApiProtocol.KEY_TOKEN)) {
                strH2 = db7Var.H();
            } else {
                db7Var.z();
            }
        }
        db7Var.q();
        return new Response(strH, strH2);
    }

    public /* bridge */ /* synthetic */ xk getConfigExtractor() {
        return xk.e;
    }

    @Override // defpackage.yk
    public /* bridge */ /* synthetic */ za7 getFailParser() {
        return nd2.b;
    }

    @Override // defpackage.yk
    public za7 getOkParser() {
        return PARSER;
    }

    @Override // defpackage.fl
    public /* bridge */ /* synthetic */ int getPriority() {
        return 16;
    }

    @Override // defpackage.fl
    public /* bridge */ /* synthetic */ kl getScope() {
        return kl.o;
    }

    @Override // defpackage.yk
    public /* bridge */ /* synthetic */ ll getScopeAfter() {
        return ll.a;
    }

    @Override // defpackage.fl
    public Uri getUri() {
        return sl.a("vchat.getAnonymTokenByLink");
    }

    @Override // defpackage.b0
    public void populateParams(el elVar) {
        elVar.b(ApiProtocol.PARAM_JOIN_LINK, this.joinLink);
        elVar.b("anonymName", this.name);
    }

    @Override // defpackage.fl
    public /* bridge */ /* synthetic */ boolean shouldGzip() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean shouldReport() {
        return true;
    }

    public GetAnonymTokenByLinkRequest(String str) {
        this(str, null);
    }
}
