package lab;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
//import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class BigInt extends Contract {
    public static final String BINARY = "{\r\n"
            + "\t\"linkReferences\": {},\r\n"
            + "\t\"object\": \"61074c610030600b82828239805160001a6073146000811461002057610022565bfe5b5030600052607381538281f300730000000000000000000000000000000000000000301460806040526004361061006e576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff168063595539cd146100735780638c3e1ff1146101a5578063b700967b146102d7575b600080fd5b81801561007f57600080fd5b5061012a600480360381019080803590602001908201803590602001908080601f016020809104026020016040519081016040528093929190818152602001838380828437820191505050505050919291929080359060200190929190803590602001908201803590602001908080601f01602080910402602001604051908101604052809392919081815260200183838082843782019150505050505091929192905050506103df565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561016a57808201518184015260208101905061014f565b50505050905090810190601f1680156101975780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b8180156101b157600080fd5b5061025c600480360381019080803590602001908201803590602001908080601f016020809104026020016040519081016040528093929190818152602001838380828437820191505050505050919291929080359060200190929190803590602001908201803590602001908080601f01602080910402602001604051908101604052809392919081815260200183838082843782019150505050505091929192905050506104ca565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561029c578082015181840152602081019050610281565b50505050905090810190601f1680156102c95780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b8180156102e357600080fd5b506103886004803603810190808035906020019082018035906020019080806020026020016040519081016040528093929190818152602001838360200280828437820191505050505050919291929080359060200190929190803590602001908201803590602001908080602002602001604051908101604052809392919081815260200183836020028082843782019150505050505091929192905050506104f8565b6040518080602001828103825283818151815260200191508051906020019060200280838360005b838110156103cb5780820151818401526020810190506103b0565b505050509050019250505060405180910390f35b606060016040519080825280601f01601f1916602001820160405280156104155781602001602082028038833980820191505090505b50905060017f01000000000000000000000000000000000000000000000000000000000000000281600081518110151561044b57fe5b9060200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a9053505b6000831415156104c0576001808416141561049f5761049c818584610504565b90505b6002838115156104ab57fe5b0492506104b9848584610504565b935061047c565b8090509392505050565b60606104ef6104ea6104db86610522565b856104e586610522565b6104f8565b610661565b90509392505050565b60608190509392505050565b60606105196105138585610710565b83610718565b90509392505050565b60606000806000806010865181151561053757fe5b04935060006010875181151561054957fe5b0611156105595783806001019450505b836040519080825280602002602001820160405280156105885781602001602082028038833980820191505090505b509450600084141561059c57849450610658565b602086015192507fffffffffffffffffffffffffffffffff00000000000000000000000000000000831692506fffffffffffffffffffffffffffffffff83049250828560008151811015156105ed57fe5b906020019060200201818152505060209150600190505b83811015610657578186015192506fffffffffffffffffffffffffffffffff8316925082858281518110151561063657fe5b90602001906020020181815250506010820191508080600101915050610604565b5b50505050919050565b606060008060108451026040519080825280601f01601f19166020018201604052801561069d5781602001602082028038833980820191505090505b5092506000845114156106b257829250610709565b600091505b83518210156107085783828151811015156106ce57fe5b90602001906020020151905070010000000000000000000000000000000081029050808260100260200184015281806001019250506106b7565b5b5050919050565b606092915050565b6060929150505600a165627a7a72305820500e787ddec4b4204916246624b86316c87088648047edf14b10e7d4d783be6e0029\",\r\n"
            + "\t\"opcodes\": \"PUSH2 0x74C PUSH2 0x30 PUSH1 0xB DUP3 DUP3 DUP3 CODECOPY DUP1 MLOAD PUSH1 0x0 BYTE PUSH1 0x73 EQ PUSH1 0x0 DUP2 EQ PUSH2 0x20 JUMPI PUSH2 0x22 JUMP JUMPDEST INVALID JUMPDEST POP ADDRESS PUSH1 0x0 MSTORE PUSH1 0x73 DUP2 MSTORE8 DUP3 DUP2 RETURN STOP PUSH20 0x0 ADDRESS EQ PUSH1 0x80 PUSH1 0x40 MSTORE PUSH1 0x4 CALLDATASIZE LT PUSH2 0x6E JUMPI PUSH1 0x0 CALLDATALOAD PUSH29 0x100000000000000000000000000000000000000000000000000000000 SWAP1 DIV PUSH4 0xFFFFFFFF AND DUP1 PUSH4 0x595539CD EQ PUSH2 0x73 JUMPI DUP1 PUSH4 0x8C3E1FF1 EQ PUSH2 0x1A5 JUMPI DUP1 PUSH4 0xB700967B EQ PUSH2 0x2D7 JUMPI JUMPDEST PUSH1 0x0 DUP1 REVERT JUMPDEST DUP2 DUP1 ISZERO PUSH2 0x7F JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST POP PUSH2 0x12A PUSH1 0x4 DUP1 CALLDATASIZE SUB DUP2 ADD SWAP1 DUP1 DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP3 ADD DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP1 DUP1 PUSH1 0x1F ADD PUSH1 0x20 DUP1 SWAP2 DIV MUL PUSH1 0x20 ADD PUSH1 0x40 MLOAD SWAP1 DUP2 ADD PUSH1 0x40 MSTORE DUP1 SWAP4 SWAP3 SWAP2 SWAP1 DUP2 DUP2 MSTORE PUSH1 0x20 ADD DUP4 DUP4 DUP1 DUP3 DUP5 CALLDATACOPY DUP3 ADD SWAP2 POP POP POP POP POP POP SWAP2 SWAP3 SWAP2 SWAP3 SWAP1 DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 SWAP3 SWAP2 SWAP1 DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP3 ADD DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP1 DUP1 PUSH1 0x1F ADD PUSH1 0x20 DUP1 SWAP2 DIV MUL PUSH1 0x20 ADD PUSH1 0x40 MLOAD SWAP1 DUP2 ADD PUSH1 0x40 MSTORE DUP1 SWAP4 SWAP3 SWAP2 SWAP1 DUP2 DUP2 MSTORE PUSH1 0x20 ADD DUP4 DUP4 DUP1 DUP3 DUP5 CALLDATACOPY DUP3 ADD SWAP2 POP POP POP POP POP POP SWAP2 SWAP3 SWAP2 SWAP3 SWAP1 POP POP POP PUSH2 0x3DF JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 DUP1 PUSH1 0x20 ADD DUP3 DUP2 SUB DUP3 MSTORE DUP4 DUP2 DUP2 MLOAD DUP2 MSTORE PUSH1 0x20 ADD SWAP2 POP DUP1 MLOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP1 DUP4 DUP4 PUSH1 0x0 JUMPDEST DUP4 DUP2 LT ISZERO PUSH2 0x16A JUMPI DUP1 DUP3 ADD MLOAD DUP2 DUP5 ADD MSTORE PUSH1 0x20 DUP2 ADD SWAP1 POP PUSH2 0x14F JUMP JUMPDEST POP POP POP POP SWAP1 POP SWAP1 DUP2 ADD SWAP1 PUSH1 0x1F AND DUP1 ISZERO PUSH2 0x197 JUMPI DUP1 DUP3 SUB DUP1 MLOAD PUSH1 0x1 DUP4 PUSH1 0x20 SUB PUSH2 0x100 EXP SUB NOT AND DUP2 MSTORE PUSH1 0x20 ADD SWAP2 POP JUMPDEST POP SWAP3 POP POP POP PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST DUP2 DUP1 ISZERO PUSH2 0x1B1 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST POP PUSH2 0x25C PUSH1 0x4 DUP1 CALLDATASIZE SUB DUP2 ADD SWAP1 DUP1 DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP3 ADD DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP1 DUP1 PUSH1 0x1F ADD PUSH1 0x20 DUP1 SWAP2 DIV MUL PUSH1 0x20 ADD PUSH1 0x40 MLOAD SWAP1 DUP2 ADD PUSH1 0x40 MSTORE DUP1 SWAP4 SWAP3 SWAP2 SWAP1 DUP2 DUP2 MSTORE PUSH1 0x20 ADD DUP4 DUP4 DUP1 DUP3 DUP5 CALLDATACOPY DUP3 ADD SWAP2 POP POP POP POP POP POP SWAP2 SWAP3 SWAP2 SWAP3 SWAP1 DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 SWAP3 SWAP2 SWAP1 DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP3 ADD DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP1 DUP1 PUSH1 0x1F ADD PUSH1 0x20 DUP1 SWAP2 DIV MUL PUSH1 0x20 ADD PUSH1 0x40 MLOAD SWAP1 DUP2 ADD PUSH1 0x40 MSTORE DUP1 SWAP4 SWAP3 SWAP2 SWAP1 DUP2 DUP2 MSTORE PUSH1 0x20 ADD DUP4 DUP4 DUP1 DUP3 DUP5 CALLDATACOPY DUP3 ADD SWAP2 POP POP POP POP POP POP SWAP2 SWAP3 SWAP2 SWAP3 SWAP1 POP POP POP PUSH2 0x4CA JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 DUP1 PUSH1 0x20 ADD DUP3 DUP2 SUB DUP3 MSTORE DUP4 DUP2 DUP2 MLOAD DUP2 MSTORE PUSH1 0x20 ADD SWAP2 POP DUP1 MLOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP1 DUP4 DUP4 PUSH1 0x0 JUMPDEST DUP4 DUP2 LT ISZERO PUSH2 0x29C JUMPI DUP1 DUP3 ADD MLOAD DUP2 DUP5 ADD MSTORE PUSH1 0x20 DUP2 ADD SWAP1 POP PUSH2 0x281 JUMP JUMPDEST POP POP POP POP SWAP1 POP SWAP1 DUP2 ADD SWAP1 PUSH1 0x1F AND DUP1 ISZERO PUSH2 0x2C9 JUMPI DUP1 DUP3 SUB DUP1 MLOAD PUSH1 0x1 DUP4 PUSH1 0x20 SUB PUSH2 0x100 EXP SUB NOT AND DUP2 MSTORE PUSH1 0x20 ADD SWAP2 POP JUMPDEST POP SWAP3 POP POP POP PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST DUP2 DUP1 ISZERO PUSH2 0x2E3 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST POP PUSH2 0x388 PUSH1 0x4 DUP1 CALLDATASIZE SUB DUP2 ADD SWAP1 DUP1 DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP3 ADD DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP1 DUP1 PUSH1 0x20 MUL PUSH1 0x20 ADD PUSH1 0x40 MLOAD SWAP1 DUP2 ADD PUSH1 0x40 MSTORE DUP1 SWAP4 SWAP3 SWAP2 SWAP1 DUP2 DUP2 MSTORE PUSH1 0x20 ADD DUP4 DUP4 PUSH1 0x20 MUL DUP1 DUP3 DUP5 CALLDATACOPY DUP3 ADD SWAP2 POP POP POP POP POP POP SWAP2 SWAP3 SWAP2 SWAP3 SWAP1 DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 SWAP3 SWAP2 SWAP1 DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP3 ADD DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 DUP1 DUP1 PUSH1 0x20 MUL PUSH1 0x20 ADD PUSH1 0x40 MLOAD SWAP1 DUP2 ADD PUSH1 0x40 MSTORE DUP1 SWAP4 SWAP3 SWAP2 SWAP1 DUP2 DUP2 MSTORE PUSH1 0x20 ADD DUP4 DUP4 PUSH1 0x20 MUL DUP1 DUP3 DUP5 CALLDATACOPY DUP3 ADD SWAP2 POP POP POP POP POP POP SWAP2 SWAP3 SWAP2 SWAP3 SWAP1 POP POP POP PUSH2 0x4F8 JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 DUP1 PUSH1 0x20 ADD DUP3 DUP2 SUB DUP3 MSTORE DUP4 DUP2 DUP2 MLOAD DUP2 MSTORE PUSH1 0x20 ADD SWAP2 POP DUP1 MLOAD SWAP1 PUSH1 0x20 ADD SWAP1 PUSH1 0x20 MUL DUP1 DUP4 DUP4 PUSH1 0x0 JUMPDEST DUP4 DUP2 LT ISZERO PUSH2 0x3CB JUMPI DUP1 DUP3 ADD MLOAD DUP2 DUP5 ADD MSTORE PUSH1 0x20 DUP2 ADD SWAP1 POP PUSH2 0x3B0 JUMP JUMPDEST POP POP POP POP SWAP1 POP ADD SWAP3 POP POP POP PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST PUSH1 0x60 PUSH1 0x1 PUSH1 0x40 MLOAD SWAP1 DUP1 DUP3 MSTORE DUP1 PUSH1 0x1F ADD PUSH1 0x1F NOT AND PUSH1 0x20 ADD DUP3 ADD PUSH1 0x40 MSTORE DUP1 ISZERO PUSH2 0x415 JUMPI DUP2 PUSH1 0x20 ADD PUSH1 0x20 DUP3 MUL DUP1 CODESIZE DUP4 CODECOPY DUP1 DUP3 ADD SWAP2 POP POP SWAP1 POP JUMPDEST POP SWAP1 POP PUSH1 0x1 PUSH32 0x100000000000000000000000000000000000000000000000000000000000000 MUL DUP2 PUSH1 0x0 DUP2 MLOAD DUP2 LT ISZERO ISZERO PUSH2 0x44B JUMPI INVALID JUMPDEST SWAP1 PUSH1 0x20 ADD ADD SWAP1 PUSH31 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF NOT AND SWAP1 DUP2 PUSH1 0x0 BYTE SWAP1 MSTORE8 POP JUMPDEST PUSH1 0x0 DUP4 EQ ISZERO ISZERO PUSH2 0x4C0 JUMPI PUSH1 0x1 DUP1 DUP5 AND EQ ISZERO PUSH2 0x49F JUMPI PUSH2 0x49C DUP2 DUP6 DUP5 PUSH2 0x504 JUMP JUMPDEST SWAP1 POP JUMPDEST PUSH1 0x2 DUP4 DUP2 ISZERO ISZERO PUSH2 0x4AB JUMPI INVALID JUMPDEST DIV SWAP3 POP PUSH2 0x4B9 DUP5 DUP6 DUP5 PUSH2 0x504 JUMP JUMPDEST SWAP4 POP PUSH2 0x47C JUMP JUMPDEST DUP1 SWAP1 POP SWAP4 SWAP3 POP POP POP JUMP JUMPDEST PUSH1 0x60 PUSH2 0x4EF PUSH2 0x4EA PUSH2 0x4DB DUP7 PUSH2 0x522 JUMP JUMPDEST DUP6 PUSH2 0x4E5 DUP7 PUSH2 0x522 JUMP JUMPDEST PUSH2 0x4F8 JUMP JUMPDEST PUSH2 0x661 JUMP JUMPDEST SWAP1 POP SWAP4 SWAP3 POP POP POP JUMP JUMPDEST PUSH1 0x60 DUP2 SWAP1 POP SWAP4 SWAP3 POP POP POP JUMP JUMPDEST PUSH1 0x60 PUSH2 0x519 PUSH2 0x513 DUP6 DUP6 PUSH2 0x710 JUMP JUMPDEST DUP4 PUSH2 0x718 JUMP JUMPDEST SWAP1 POP SWAP4 SWAP3 POP POP POP JUMP JUMPDEST PUSH1 0x60 PUSH1 0x0 DUP1 PUSH1 0x0 DUP1 PUSH1 0x10 DUP7 MLOAD DUP2 ISZERO ISZERO PUSH2 0x537 JUMPI INVALID JUMPDEST DIV SWAP4 POP PUSH1 0x0 PUSH1 0x10 DUP8 MLOAD DUP2 ISZERO ISZERO PUSH2 0x549 JUMPI INVALID JUMPDEST MOD GT ISZERO PUSH2 0x559 JUMPI DUP4 DUP1 PUSH1 0x1 ADD SWAP5 POP POP JUMPDEST DUP4 PUSH1 0x40 MLOAD SWAP1 DUP1 DUP3 MSTORE DUP1 PUSH1 0x20 MUL PUSH1 0x20 ADD DUP3 ADD PUSH1 0x40 MSTORE DUP1 ISZERO PUSH2 0x588 JUMPI DUP2 PUSH1 0x20 ADD PUSH1 0x20 DUP3 MUL DUP1 CODESIZE DUP4 CODECOPY DUP1 DUP3 ADD SWAP2 POP POP SWAP1 POP JUMPDEST POP SWAP5 POP PUSH1 0x0 DUP5 EQ ISZERO PUSH2 0x59C JUMPI DUP5 SWAP5 POP PUSH2 0x658 JUMP JUMPDEST PUSH1 0x20 DUP7 ADD MLOAD SWAP3 POP PUSH32 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000000000000000000000000000 DUP4 AND SWAP3 POP PUSH16 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF DUP4 DIV SWAP3 POP DUP3 DUP6 PUSH1 0x0 DUP2 MLOAD DUP2 LT ISZERO ISZERO PUSH2 0x5ED JUMPI INVALID JUMPDEST SWAP1 PUSH1 0x20 ADD SWAP1 PUSH1 0x20 MUL ADD DUP2 DUP2 MSTORE POP POP PUSH1 0x20 SWAP2 POP PUSH1 0x1 SWAP1 POP JUMPDEST DUP4 DUP2 LT ISZERO PUSH2 0x657 JUMPI DUP2 DUP7 ADD MLOAD SWAP3 POP PUSH16 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF DUP4 AND SWAP3 POP DUP3 DUP6 DUP3 DUP2 MLOAD DUP2 LT ISZERO ISZERO PUSH2 0x636 JUMPI INVALID JUMPDEST SWAP1 PUSH1 0x20 ADD SWAP1 PUSH1 0x20 MUL ADD DUP2 DUP2 MSTORE POP POP PUSH1 0x10 DUP3 ADD SWAP2 POP DUP1 DUP1 PUSH1 0x1 ADD SWAP2 POP POP PUSH2 0x604 JUMP JUMPDEST JUMPDEST POP POP POP POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x60 PUSH1 0x0 DUP1 PUSH1 0x10 DUP5 MLOAD MUL PUSH1 0x40 MLOAD SWAP1 DUP1 DUP3 MSTORE DUP1 PUSH1 0x1F ADD PUSH1 0x1F NOT AND PUSH1 0x20 ADD DUP3 ADD PUSH1 0x40 MSTORE DUP1 ISZERO PUSH2 0x69D JUMPI DUP2 PUSH1 0x20 ADD PUSH1 0x20 DUP3 MUL DUP1 CODESIZE DUP4 CODECOPY DUP1 DUP3 ADD SWAP2 POP POP SWAP1 POP JUMPDEST POP SWAP3 POP PUSH1 0x0 DUP5 MLOAD EQ ISZERO PUSH2 0x6B2 JUMPI DUP3 SWAP3 POP PUSH2 0x709 JUMP JUMPDEST PUSH1 0x0 SWAP2 POP JUMPDEST DUP4 MLOAD DUP3 LT ISZERO PUSH2 0x708 JUMPI DUP4 DUP3 DUP2 MLOAD DUP2 LT ISZERO ISZERO PUSH2 0x6CE JUMPI INVALID JUMPDEST SWAP1 PUSH1 0x20 ADD SWAP1 PUSH1 0x20 MUL ADD MLOAD SWAP1 POP PUSH17 0x100000000000000000000000000000000 DUP2 MUL SWAP1 POP DUP1 DUP3 PUSH1 0x10 MUL PUSH1 0x20 ADD DUP5 ADD MSTORE DUP2 DUP1 PUSH1 0x1 ADD SWAP3 POP POP PUSH2 0x6B7 JUMP JUMPDEST JUMPDEST POP POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x60 SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x60 SWAP3 SWAP2 POP POP JUMP STOP LOG1 PUSH6 0x627A7A723058 KECCAK256 POP 0xe PUSH25 0x7DDEC4B4204916246624B86316C87088648047EDF14B10E7D4 0xd7 DUP4 0xbe PUSH15 0x2900000000000000000000000000 \",\r\n"
            + "\t\"sourceMap\": \"329:2749:0:-;;132:2:-1;166:7;155:9;146:7;137:37;252:7;246:14;243:1;238:23;232:4;229:33;270:1;265:20;;;;222:63;;265:20;274:9;222:63;;298:9;295:1;288:20;328:4;319:7;311:22;352:7;343;336:24\"\r\n"
            + "}";

    public static final String FUNC_MODEXP_NAIVE = "modexp_naive";

    public static final String FUNC_modexp = "modexp";

    @Deprecated
    protected BigInt(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected BigInt(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected BigInt(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected BigInt(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> modexp_naive(byte[] b, BigInteger e, byte[] m) {
        final Function function = new Function(
                FUNC_MODEXP_NAIVE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicBytes(b), 
                new org.web3j.abi.datatypes.generated.Uint256(e), 
                new org.web3j.abi.datatypes.DynamicBytes(m)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> modexp(byte[] b, BigInteger e, byte[] m) {
        final Function function = new Function(
                FUNC_modexp, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicBytes(b), 
                new org.web3j.abi.datatypes.generated.Uint256(e), 
                new org.web3j.abi.datatypes.DynamicBytes(m)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> modexp(List<BigInteger> b, BigInteger e, List<BigInteger> m) {
        final Function function = new Function(
                FUNC_modexp, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(b, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.Uint256(e), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(m, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static BigInt load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new BigInt(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static BigInt load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new BigInt(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static BigInt load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new BigInt(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static BigInt load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new BigInt(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<BigInt> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(BigInt.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<BigInt> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(BigInt.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<BigInt> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(BigInt.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<BigInt> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(BigInt.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
