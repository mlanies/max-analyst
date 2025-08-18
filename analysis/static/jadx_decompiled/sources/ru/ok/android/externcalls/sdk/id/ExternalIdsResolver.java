package ru.ok.android.externcalls.sdk.id;

import defpackage.bg1;
import defpackage.muc;
import defpackage.p00;
import defpackage.pa3;
import defpackage.sa3;
import defpackage.wa3;
import defpackage.zad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

/* loaded from: classes2.dex */
public class ExternalIdsResolver {
    private final ExtraResolver extraResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final IdsMapper<bg1, ParticipantId> idsMapper;
    private final LocalIdMappings localIdMappings;
    private final ParticipantPrivateStateModifier participantPrivateStateModifier;
    private final ParticipantStore store;

    public interface ExtraResolver {
        ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant);
    }

    public interface ParticipantPrivateStateModifier {
        void setExternalId(ConversationParticipant conversationParticipant, ParticipantId participantId);
    }

    public ExternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper, ExtraResolver extraResolver, ParticipantPrivateStateModifier participantPrivateStateModifier, LocalIdMappings localIdMappings, IdsMapper<bg1, ParticipantId> idsMapper) {
        this.store = participantStore;
        this.idMappingWrapper = idMappingWrapper;
        this.extraResolver = extraResolver;
        this.participantPrivateStateModifier = participantPrivateStateModifier;
        this.localIdMappings = localIdMappings;
        this.idsMapper = idsMapper;
    }

    private void applyExternals(Map<bg1, ParticipantId> map) {
        for (Map.Entry<bg1, ParticipantId> entry : map.entrySet()) {
            bg1 key = entry.getKey();
            ParticipantId value = entry.getValue();
            ConversationParticipant byInternal = this.store.getByInternal(key);
            this.idMappingWrapper.addMapping(value, key);
            if (byInternal != null) {
                this.localIdMappings.addMappings(byInternal);
                this.participantPrivateStateModifier.setExternalId(byInternal, value);
            }
        }
    }

    private void collectExternalIdResolutionCandidatesForSessionRoom(List<bg1> list, Map<LocalParticipantId, ConversationParticipant> map) {
        for (ConversationParticipant conversationParticipant : map.values()) {
            if (conversationParticipant.getExternalId() == null) {
                ParticipantId participantIdOnExternalByInternalResolution = this.extraResolver.onExternalByInternalResolution(conversationParticipant);
                if (participantIdOnExternalByInternalResolution == null) {
                    list.add(ConversationParticipantExtensionsKt.getInternalIdExt(conversationParticipant));
                } else {
                    this.participantPrivateStateModifier.setExternalId(conversationParticipant, participantIdOnExternalByInternalResolution);
                    this.idMappingWrapper.addMapping(participantIdOnExternalByInternalResolution, ConversationParticipantExtensionsKt.getInternalIdExt(conversationParticipant));
                    this.localIdMappings.addMappings(conversationParticipant);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveIds$0(List list) throws Throwable {
        applyExternals(this.idsMapper.map(list));
    }

    public List<bg1> collectExternalIdResolutionCandidates() {
        ArrayList arrayList = new ArrayList();
        Map<zad, Map<LocalParticipantId, ConversationParticipant>> roomToParticipantsMap = this.store.getRoomToParticipantsMap();
        Iterator<zad> it = roomToParticipantsMap.keySet().iterator();
        while (it.hasNext()) {
            Map<LocalParticipantId, ConversationParticipant> map = roomToParticipantsMap.get(it.next());
            if (map != null) {
                collectExternalIdResolutionCandidatesForSessionRoom(arrayList, map);
            }
        }
        return arrayList;
    }

    public pa3 resolveIds(List<bg1> list) {
        return list.isEmpty() ? wa3.a : new sa3(1, new p00(this, 2, list)).k(muc.b());
    }
}
