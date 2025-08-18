package ru.ok.android.externcalls.sdk.api;

import defpackage.b66;
import defpackage.ce;
import defpackage.el;
import defpackage.ig5;
import defpackage.iqd;
import defpackage.kl;
import defpackage.l37;
import defpackage.p6b;
import defpackage.qpc;
import defpackage.rk0;
import defpackage.s5c;
import defpackage.tu0;
import defpackage.x53;
import defpackage.z84;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J_\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010!JK\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$JK\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b&\u0010$J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J7\u0010/\u001a\u00020+2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b/\u00100J7\u00101\u001a\u00020+2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b1\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102¨\u00064"}, d2 = {"Lru/ok/android/externcalls/sdk/api/OkApiService;", "", "Lqpc;", "rxApiClient", "<init>", "(Lqpc;)V", "", "servers", "cid", "", "createLink", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "opponent", "", "", "opponentInternalIds", "opponentExternalIds", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "params", "Liqd;", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "startConversationImpl", "(Ljava/lang/String;Ljava/lang/String;ZLru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Liqd;", ApiProtocol.PARAM_PEER_ID, "Lru/ok/android/externcalls/sdk/api/JoinByIdResponse;", "joinToConversation", "(Ljava/lang/String;JLru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Liqd;", "anonToken", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "getConversationParams", "(Ljava/lang/String;Ljava/lang/String;)Liqd;", "initialJoinLink", "getJoinConversationParamsExt", "(Ljava/lang/String;Ljava/lang/String;JLru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Liqd;", "opponents", "startConversation", "(Ljava/lang/String;Ljava/lang/String;ZLru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Liqd;", "opponentIds", "startConversationWithExternalIds", ApiProtocol.PARAM_CREATE_JOIN_LINK, "(Ljava/lang/String;)Liqd;", "Lrk0;", "joinReq", "Le5f;", "addJoinToConversationParams", "(Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lrk0;)V", "startReq", "addCreateConversationParams", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lrk0;)V", "addCreateConversationParamsByExternalOpponentIds", "Lqpc;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class OkApiService {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "OkApiService";
    private static final String METHOD_CREATE_JOIN_LINK = "vchat.createJoinLink";
    private static final String METHOD_GET_CONVERSATION_PARAMS = "vchat.getConversationParams";
    private static final String METHOD_JOIN_TO_CONVERSATION = "vchat.joinConversation";
    private static final String METHOD_START_CONVERSATION = "vchat.startConversation";
    private final qpc rxApiClient;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/api/OkApiService$Companion;", "", "()V", "LOG_TAG", "", "METHOD_CREATE_JOIN_LINK", "METHOD_GET_CONVERSATION_PARAMS", "METHOD_JOIN_TO_CONVERSATION", "METHOD_START_CONVERSATION", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    public OkApiService(qpc qpcVar) {
        this.rxApiClient = qpcVar;
    }

    public static /* synthetic */ iqd getConversationParams$default(OkApiService okApiService, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationParams");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return okApiService.getConversationParams(str, str2);
    }

    private final iqd startConversationImpl(String servers, String cid, boolean createLink, ConversationParticipant opponent, List<Long> opponentInternalIds, List<String> opponentExternalIds, StartCallApiParams params) {
        qpc qpcVar = this.rxApiClient;
        rk0 rk0VarS = tu0.s(METHOD_START_CONVERSATION);
        rk0VarS.b = kl.c;
        rk0VarS.c(ApiProtocol.PARAM_IS_VIDEO, params.getIsVideo());
        rk0VarS.b(ApiProtocol.PARAM_TURN_SERVERS, servers);
        rk0VarS.b(ApiProtocol.PARAM_CONVERSATION_ID, cid);
        rk0VarS.c(ApiProtocol.PARAM_CREATE_JOIN_LINK, createLink);
        if (params.getIsMultipleDevicesEnabled()) {
            GlobalRTCLogger.log(LOG_TAG, "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6");
            rk0VarS.c.a(new l37(ApiProtocol.PARAM_PROTOCOL_VERSION, 6));
        }
        String domainId = params.getDomainId();
        if (domainId != null) {
            rk0VarS.b(ApiProtocol.PARAM_DOMAIN_ID, domainId);
        }
        String payload = params.getPayload();
        if (payload != null) {
            rk0VarS.b(ApiProtocol.PARAM_PAYLOAD, payload);
        }
        if (opponentInternalIds != null) {
            addCreateConversationParams(opponent, opponentInternalIds, params, rk0VarS);
        }
        if (opponentExternalIds != null) {
            addCreateConversationParamsByExternalOpponentIds(opponent, opponentExternalIds, params, rk0VarS);
        }
        rk0VarS.c(ApiProtocol.PARAM_ONLY_ADMIN_CAN_SHARE_MOVIE, !params.getIsWatchTogetherEnabledForAll());
        return qpcVar.a(rk0VarS.a(CallInfo.PARSER)).i(ce.a());
    }

    public void addCreateConversationParams(ConversationParticipant opponent, List<Long> opponents, StartCallApiParams params, rk0 startReq) {
        if (!opponents.isEmpty()) {
            startReq.b(ApiProtocol.PARAM_UIDS, x53.n0(opponents, ",", null, null, null, 62));
        }
    }

    public void addCreateConversationParamsByExternalOpponentIds(ConversationParticipant opponent, List<String> opponents, StartCallApiParams params, rk0 startReq) {
        if (!opponents.isEmpty()) {
            startReq.b(ApiProtocol.PARAM_EXTERNAL_IDS, x53.n0(opponents, ",", null, null, null, 62));
        }
    }

    public void addJoinToConversationParams(StartCallApiParams params, rk0 joinReq) {
    }

    public final iqd createJoinLink(String cid) {
        qpc qpcVar = this.rxApiClient;
        rk0 rk0VarS = tu0.s(METHOD_CREATE_JOIN_LINK);
        rk0VarS.b = kl.c;
        rk0VarS.b(ApiProtocol.PARAM_CONVERSATION_ID, cid);
        return qpcVar.a(rk0VarS.a(new UnwrappingParser(ApiProtocol.KEY_JOIN_LINK, new ig5(28)))).i(ce.a());
    }

    public final iqd getConversationParams(String anonToken, String cid) {
        qpc qpcVar = this.rxApiClient;
        rk0 rk0VarS = tu0.s(METHOD_GET_CONVERSATION_PARAMS);
        rk0VarS.b = kl.c;
        if (anonToken != null) {
            rk0VarS.b(ApiProtocol.PARAM_ANONYM_TOKEN, anonToken);
        }
        if (cid != null) {
            rk0VarS.b(ApiProtocol.PARAM_CONVERSATION_ID, cid);
        }
        return qpcVar.a(rk0VarS.a(ConversationParams.PARSER)).i(ce.a());
    }

    public final iqd getJoinConversationParamsExt(String initialJoinLink, String anonToken, long peerId, StartCallApiParams params) {
        rk0 rk0VarS = tu0.s("vchat.joinConversationByLink");
        rk0VarS.b = kl.c;
        rk0VarS.b(ApiProtocol.PARAM_JOIN_LINK, initialJoinLink);
        rk0VarS.c(ApiProtocol.PARAM_IS_VIDEO, params.getIsVideo());
        l37 l37Var = new l37(ApiProtocol.PARAM_PEER_ID, peerId);
        el elVar = rk0VarS.c;
        elVar.a(l37Var);
        rk0VarS.b(ApiProtocol.PARAM_ANONYM_TOKEN, anonToken);
        if (params.getPayload() != null) {
            elVar.a(new p6b(ApiProtocol.PARAM_PAYLOAD, params.getPayload()));
        }
        if (params.getIsMultipleDevicesEnabled()) {
            elVar.a(new l37(ApiProtocol.PARAM_PROTOCOL_VERSION, 6));
        }
        return this.rxApiClient.a(rk0VarS.a(JoinByLinkResponse.PARSER)).h(new b66() { // from class: ru.ok.android.externcalls.sdk.api.OkApiService.getJoinConversationParamsExt.1
            @Override // defpackage.b66
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final ConversationParams mo131apply(JoinByLinkResponse joinByLinkResponse) {
                return joinByLinkResponse.toParams();
            }
        });
    }

    public final iqd joinToConversation(String cid, long peerId, StartCallApiParams params) {
        rk0 rk0VarS = tu0.s(METHOD_JOIN_TO_CONVERSATION);
        rk0VarS.b = kl.c;
        rk0VarS.b(ApiProtocol.PARAM_CONVERSATION_ID, cid);
        l37 l37Var = new l37(ApiProtocol.PARAM_PEER_ID, peerId);
        el elVar = rk0VarS.c;
        elVar.a(l37Var);
        rk0VarS.c(ApiProtocol.PARAM_IS_VIDEO, params.getIsVideo());
        Long chatId = params.getChatId();
        if (chatId != null) {
            elVar.a(new l37(ApiProtocol.PARAM_CHAT_ID, chatId.longValue()));
        }
        if (params.getIsMultipleDevicesEnabled()) {
            GlobalRTCLogger.log(LOG_TAG, "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6");
            elVar.a(new l37(ApiProtocol.PARAM_PROTOCOL_VERSION, 6));
        }
        addJoinToConversationParams(params, rk0VarS);
        return this.rxApiClient.a(rk0VarS.a(s5c.b)).h(new b66() { // from class: ru.ok.android.externcalls.sdk.api.OkApiService.joinToConversation.1
            @Override // defpackage.b66
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final JoinByIdResponse mo131apply(JSONObject jSONObject) {
                return new JoinByIdResponse(jSONObject.optBoolean(ApiProtocol.KEY_P2P_FORBIDDEN, false), jSONObject.optString(ApiProtocol.KEY_ENDPOINT), jSONObject.optInt(ApiProtocol.KEY_DEVICE_IDX));
            }
        }).i(ce.a());
    }

    public final iqd startConversation(String servers, String cid, boolean createLink, ConversationParticipant opponent, List<Long> opponents, StartCallApiParams params) {
        return startConversationImpl(servers, cid, createLink, opponent, opponents, null, params);
    }

    public final iqd startConversationWithExternalIds(String servers, String cid, boolean createLink, ConversationParticipant opponent, List<String> opponentIds, StartCallApiParams params) {
        return startConversationImpl(servers, cid, createLink, opponent, null, opponentIds, params);
    }
}
