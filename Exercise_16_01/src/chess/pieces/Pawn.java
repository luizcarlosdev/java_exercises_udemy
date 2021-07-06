package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position position = new Position(0, 0);

		if (getColor() == Color.WHITE) {
			position.setValues(this.position.getRow() - 1, this.position.getColumn());

			// check above position
			if (getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)) {
				matrix[position.getRow()][position.getColumn()] = true;
			}
			position.setValues(this.position.getRow() - 2, this.position.getColumn());
			Position position2 = new Position(this.position.getRow() - 1, this.position.getColumn());

			// check two above position for first move
			if (getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)
					&& getBoard().positionExists(position2) && !getBoard().thereIsAPiece(position2)
					&& getMoveCount() == 0) {
				matrix[position.getRow()][position.getColumn()] = true;
			}

			// check northeast position
			position.setValues(this.position.getRow() - 1, this.position.getColumn() - 1);
			if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
				matrix[position.getRow()][position.getColumn()] = true;
			}

			// check northwest position
			position.setValues(this.position.getRow() - 1, this.position.getColumn() + 1);
			if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
				matrix[position.getRow()][position.getColumn()] = true;
			}
		} else {
			position.setValues(this.position.getRow() + 1, this.position.getColumn());
			// check above position
			if (getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)) {
				matrix[position.getRow()][position.getColumn()] = true;
			}
			position.setValues(this.position.getRow() + 2, this.position.getColumn());
			Position position2 = new Position(this.position.getRow() + 1, this.position.getColumn());

			// check two above position for first move
			if (getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)
					&& getBoard().positionExists(position2) && !getBoard().thereIsAPiece(position2)
					&& getMoveCount() == 0) {
				matrix[position.getRow()][position.getColumn()] = true;
			}

			// check northeast position
			position.setValues(this.position.getRow() + 1, this.position.getColumn() - 1);
			if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
				matrix[position.getRow()][position.getColumn()] = true;
			}

			// check northwest position
			position.setValues(this.position.getRow() + 1, this.position.getColumn() + 1);
			if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
				matrix[position.getRow()][position.getColumn()] = true;
			}
		}

		return matrix;
		
		
	}
	
	@Override
	public String toString() {
		return "P";
	}

}
