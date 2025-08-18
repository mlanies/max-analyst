package ru.ok.android.externcalls.sdk.feature.internal.commands;

import defpackage.eg1;
import defpackage.k56;
import defpackage.rd7;
import defpackage.u61;
import defpackage.v61;
import defpackage.w61;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConversationFeatureCommandExecutorImpl$enableFeatureForRoles$params$1 extends rd7 implements k56 {
    final /* synthetic */ u61 $feature;
    final /* synthetic */ Set<eg1> $roles;
    final /* synthetic */ ConversationFeatureCommandExecutorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationFeatureCommandExecutorImpl$enableFeatureForRoles$params$1(ConversationFeatureCommandExecutorImpl conversationFeatureCommandExecutorImpl, u61 u61Var, Set<? extends eg1> set) {
        super(0);
        this.this$0 = conversationFeatureCommandExecutorImpl;
        this.$feature = u61Var;
        this.$roles = set;
    }

    @Override // defpackage.k56
    public final JSONObject invoke() throws JSONException {
        String str;
        String str2;
        w61 w61Var = this.this$0.paramsCreator;
        u61 u61Var = this.$feature;
        Set<eg1> set = this.$roles;
        w61Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "enable-feature-for-roles");
        int i = v61.$EnumSwitchMapping$0[u61Var.ordinal()];
        if (i == 1) {
            str = "ADD_PARTICIPANT";
        } else if (i == 2) {
            str = "RECORD";
        } else if (i == 3) {
            str = "MOVIE_SHARE";
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "ASR";
        }
        jSONObject.put("feature", str);
        JSONArray jSONArray = new JSONArray();
        Iterator<eg1> it = set.iterator();
        while (it.hasNext()) {
            int i2 = v61.$EnumSwitchMapping$1[it.next().ordinal()];
            if (i2 == 1) {
                str2 = "CREATOR";
            } else if (i2 == 2) {
                str2 = "ADMIN";
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "SPEAKER";
            }
            jSONArray.put(str2);
        }
        jSONObject.put("roles", jSONArray);
        return jSONObject;
    }
}
