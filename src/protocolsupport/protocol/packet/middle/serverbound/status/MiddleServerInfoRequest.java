package protocolsupport.protocol.packet.middle.serverbound.status;

import protocolsupport.protocol.packet.ServerBoundPacket;
import protocolsupport.protocol.packet.middle.ServerBoundMiddlePacket;
import protocolsupport.protocol.packet.middleimpl.ServerBoundPacketData;
import protocolsupport.utils.recyclable.RecyclableCollection;
import protocolsupport.utils.recyclable.RecyclableSingletonList;

public abstract class MiddleServerInfoRequest extends ServerBoundMiddlePacket {

	@Override
	public RecyclableCollection<ServerBoundPacketData> toNative() {
		return RecyclableSingletonList.create(ServerBoundPacketData.create(ServerBoundPacket.STATUS_REQUEST));
	}

}
