package ru.ok.android.externcalls.sdk.id;

import defpackage.bg1;
import defpackage.iqd;
import defpackage.l5;
import defpackage.muc;
import defpackage.q1a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

/* loaded from: classes2.dex */
public class InternalIdsResolver {
    private final IdMappingWrapper idMappingWrapper;
    private final LocalIdMappings localIdMappings;
    private final IdsMapper<ParticipantId, bg1> mapper;
    private final ParticipantPrivateStateModifier stateModifier;
    private final ParticipantStore store;

    public interface ParticipantPrivateStateModifier {
        void setInternalId(ConversationParticipant conversationParticipant, bg1 bg1Var);
    }

    public InternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper, ParticipantPrivateStateModifier participantPrivateStateModifier, LocalIdMappings localIdMappings, IdsMapper<ParticipantId, bg1> idsMapper) {
        this.idMappingWrapper = idMappingWrapper;
        this.store = participantStore;
        this.stateModifier = participantPrivateStateModifier;
        this.localIdMappings = localIdMappings;
        this.mapper = idsMapper;
    }

    private void applyInternalIds(Map<ParticipantId, bg1> map) {
        for (Map.Entry<ParticipantId, bg1> entry : map.entrySet()) {
            bg1 value = entry.getValue();
            ParticipantId key = entry.getKey();
            ConversationParticipant byExternal = this.store.getByExternal(key);
            this.idMappingWrapper.addMapping(key, value);
            if (byExternal != null) {
                this.stateModifier.setInternalId(byExternal, value);
                this.localIdMappings.addMappings(byExternal);
            }
        }
    }

    private List<ParticipantId> getResolutionCandidates() {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = this.store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (ConversationParticipantExtensionsKt.getInternalIdExt(next) == null) {
                arrayList.add(next.getExternalId());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Set lambda$resolveIdsAndGetFailed$0() throws Exception {
        List<ParticipantId> resolutionCandidates = getResolutionCandidates();
        if (resolutionCandidates.isEmpty()) {
            return Collections.emptySet();
        }
        applyInternalIds(this.mapper.map(resolutionCandidates));
        HashSet hashSet = new HashSet(getResolutionCandidates());
        HashSet hashSet2 = new HashSet(resolutionCandidates);
        hashSet2.retainAll(hashSet);
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            this.store.removeByExternal((ParticipantId) it.next());
        }
        return hashSet2;
    }

    public iqd resolveIdsAndGetFailed() {
        return new q1a(2, new l5(7, this)).m(muc.b());
    }
}
